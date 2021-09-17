
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Stories implements Serializable, Parcelable
{

    @SerializedName("available")
    @Expose
    public Integer available;
    @SerializedName("collectionURI")
    @Expose
    public String collectionURI;
    @SerializedName("items")
    @Expose
    public List<Item__2> items = null;
    @SerializedName("returned")
    @Expose
    public Integer returned;
    public final static Creator<Stories> CREATOR = new Creator<Stories>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stories createFromParcel(android.os.Parcel in) {
            return new Stories(in);
        }

        public Stories[] newArray(int size) {
            return (new Stories[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6096373967620129210L;

    protected Stories(android.os.Parcel in) {
        this.available = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.items, (Item__2.class.getClassLoader()));
        this.returned = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Stories() {
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
