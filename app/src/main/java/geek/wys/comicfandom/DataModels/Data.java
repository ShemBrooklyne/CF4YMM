
package geek.wys.comicfandom.DataModels;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

@lombok.Data
public class Data implements Serializable, Parcelable
{

    @SerializedName("offset")
    @Expose
    public Integer offset;
    @SerializedName("limit")
    @Expose
    public Integer limit;
    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("count")
    @Expose
    public Integer count;
    @SerializedName("results")
    @Expose
    public List<Result> results = null;
    public final static Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Data createFromParcel(android.os.Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4548325106332066370L;

    protected Data(android.os.Parcel in) {
        this.offset = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.limit = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.results, (Result.class.getClassLoader()));
    }

    public Data() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(offset);
        dest.writeValue(limit);
        dest.writeValue(total);
        dest.writeValue(count);
        dest.writeList(results);
    }

    public int describeContents() {
        return  0;
    }

}
