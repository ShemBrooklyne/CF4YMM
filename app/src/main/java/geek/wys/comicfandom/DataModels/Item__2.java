
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item__2 implements Serializable, Parcelable
{

    @SerializedName("resourceURI")
    @Expose
    public String resourceURI;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("type")
    @Expose
    public String type;
    public final static Creator<Item__2> CREATOR = new Creator<Item__2>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Item__2 createFromParcel(android.os.Parcel in) {
            return new Item__2(in);
        }

        public Item__2 [] newArray(int size) {
            return (new Item__2[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8110481034835775124L;

    protected Item__2(android.os.Parcel in) {
        this.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Item__2() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(resourceURI);
        dest.writeValue(name);
        dest.writeValue(type);
    }

    public int describeContents() {
        return  0;
    }

}
