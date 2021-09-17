
package geek.wys.comicfandom.DataModels;


import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

@Data
public class Url implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("url")
    @Expose
    public String url;
    public final static Creator<Url> CREATOR = new Creator<Url>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Url createFromParcel(android.os.Parcel in) {
            return new Url(in);
        }

        public Url[] newArray(int size) {
            return (new Url[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3775681859438243122L;

    protected Url(android.os.Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Url() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
