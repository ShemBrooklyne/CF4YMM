
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@lombok.Data
public class MarvelResponse implements Serializable, Parcelable
{

    @SerializedName("code")
    @Expose
    public Integer code;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("copyright")
    @Expose
    public String copyright;
    @SerializedName("attributionText")
    @Expose
    public String attributionText;
    @SerializedName("attributionHTML")
    @Expose
    public String attributionHTML;
    @SerializedName("etag")
    @Expose
    public String etag;
    @SerializedName("data")
    @Expose
    public Data data;
    public final static Creator<MarvelResponse> CREATOR = new Creator<MarvelResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MarvelResponse createFromParcel(android.os.Parcel in) {
            return new MarvelResponse(in);
        }

        public MarvelResponse[] newArray(int size) {
            return (new MarvelResponse[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4903306516298652872L;

    protected MarvelResponse(android.os.Parcel in) {
        this.code = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.attributionText = ((String) in.readValue((String.class.getClassLoader())));
        this.attributionHTML = ((String) in.readValue((String.class.getClassLoader())));
        this.etag = ((String) in.readValue((String.class.getClassLoader())));
        this.data = ((Data) in.readValue((Data.class.getClassLoader())));
    }

    public MarvelResponse() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(code);
        dest.writeValue(status);
        dest.writeValue(copyright);
        dest.writeValue(attributionText);
        dest.writeValue(attributionHTML);
        dest.writeValue(etag);
        dest.writeValue(data);
    }

    public int describeContents() {
        return  0;
    }

}
