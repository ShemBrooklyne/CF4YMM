
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Events implements Serializable, Parcelable
{

    @SerializedName("available")
    @Expose
    public Integer available;
    @SerializedName("collectionURI")
    @Expose
    public String collectionURI;
    @SerializedName("items")
    @Expose
    public List<Item__3> items = null;
    @SerializedName("returned")
    @Expose
    public Integer returned;
    public final static Creator<Events> CREATOR = new Creator<Events>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Events createFromParcel(android.os.Parcel in) {
            return new Events(in);
        }

        public Events[] newArray(int size) {
            return (new Events[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2688841297167842766L;

    protected Events(android.os.Parcel in) {
        this.available = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.items, (Item__3.class.getClassLoader()));
        this.returned = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Events() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(available);
        dest.writeValue(collectionURI);
        dest.writeList(items);
        dest.writeValue(returned);
    }

    public int describeContents() {
        return  0;
    }

}
