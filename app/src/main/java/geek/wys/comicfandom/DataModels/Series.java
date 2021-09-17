
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Series implements Serializable, Parcelable
{

    @SerializedName("available")
    @Expose
    public Integer available;
    @SerializedName("collectionURI")
    @Expose
    public String collectionURI;
    @SerializedName("items")
    @Expose
    public List<Item__1> items = null;
    @SerializedName("returned")
    @Expose
    public Integer returned;
    public final static Creator<Series> CREATOR = new Creator<Series>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Series createFromParcel(android.os.Parcel in) {
            return new Series(in);
        }

        public Series[] newArray(int size) {
            return (new Series[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8833066164970579607L;

    protected Series(android.os.Parcel in) {
        this.available = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.collectionURI = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.items, (Item__1.class.getClassLoader()));
        this.returned = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Series() {
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
