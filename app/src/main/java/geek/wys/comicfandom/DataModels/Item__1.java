
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

@Data
public class Item__1 implements Serializable, Parcelable
{

    @SerializedName("resourceURI")
    @Expose
    public String resourceURI;
    @SerializedName("name")
    @Expose
    public String name;
    public final static Creator<Item__1> CREATOR = new Creator<Item__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Item__1 createFromParcel(android.os.Parcel in) {
            return new Item__1(in);
        }

        public Item__1 [] newArray(int size) {
            return (new Item__1[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3318032365897484465L;

    protected Item__1(android.os.Parcel in) {
        this.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Item__1() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(resourceURI);
        dest.writeValue(name);
    }

    public int describeContents() {
        return  0;
    }

}
