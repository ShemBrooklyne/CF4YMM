
package geek.wys.comicfandom.DataModels;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Result implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("modified")
    @Expose
    public String modified;
    @SerializedName("thumbnail")
    @Expose
    public Thumbnail thumbnail;
    @SerializedName("resourceURI")
    @Expose
    public String resourceURI;
    @SerializedName("comics")
    @Expose
    public Comics comics;
    @SerializedName("series")
    @Expose
    public Series series;
    @SerializedName("stories")
    @Expose
    public Stories stories;
    @SerializedName("events")
    @Expose
    public Events events;
    @SerializedName("urls")
    @Expose
    public List<Url> urls = null;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(android.os.Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;
    private final static long serialVersionUID = -9137539896465230800L;

    protected Result(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.modified = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnail = ((Thumbnail) in.readValue((Thumbnail.class.getClassLoader())));
        this.resourceURI = ((String) in.readValue((String.class.getClassLoader())));
        this.comics = ((Comics) in.readValue((Comics.class.getClassLoader())));
        this.series = ((Series) in.readValue((Series.class.getClassLoader())));
        this.stories = ((Stories) in.readValue((Stories.class.getClassLoader())));
        this.events = ((Events) in.readValue((Events.class.getClassLoader())));
        in.readList(this.urls, (Url.class.getClassLoader()));
    }

    public Result() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(modified);
        dest.writeValue(thumbnail);
        dest.writeValue(resourceURI);
        dest.writeValue(comics);
        dest.writeValue(series);
        dest.writeValue(stories);
        dest.writeValue(events);
        dest.writeList(urls);
    }

    public int describeContents() {
        return  0;
    }

}
