
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item__3 implements Serializable, Parcelable
{

    @SerializedName("resourceURI")
    @Expose
    public String resourceURI;
    @SerializedName("name")
    @Expose
    public String name;
    public final static Creator<Item__3> CREATOR = new Creator<Item__3>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Item__3 createFromParcel(android.os.Parcel in) {
            return new Item__3(in);
        }

        public Item__3 [] newArray(int size) {
            return (new Item__3[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6156175449990381702L;

    protected Item__3(android.os.Parcel in) {
        this.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Item__3() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(resourceURI);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
