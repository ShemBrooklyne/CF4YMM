
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

@Data
public class Thumbnail implements Serializable, Parcelable
{

    @SerializedName("path")
    @Expose
    public String path;
    @SerializedName("extension")
    @Expose
    public String extension;
    public final static Creator<Thumbnail> CREATOR = new Creator<Thumbnail>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Thumbnail createFromParcel(android.os.Parcel in) {
            return new Thumbnail(in);
        }

        public Thumbnail[] newArray(int size) {
            return (new Thumbnail[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3500414473088402601L;

    protected Thumbnail(android.os.Parcel in) {
        this.path = ((String) in.readValue((String.class.getClassLoader())));
        this.extension = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Thumbnail() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(path);
        dest.writeValue(extension);
    }

    public int describeContents() {
        return  0;
    }

}
