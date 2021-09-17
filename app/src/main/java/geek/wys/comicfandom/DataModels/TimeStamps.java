package geek.wys.comicfandom.DataModels;

import java.util.UUID;

import lombok.Data;

@Data
public class TimeStamps {

//    public Long timeStamp = this.newStamp.getTime();
    public String randomUUID = UUID.randomUUID().toString().replace("-", "");



    //Generate timestamps to be used while making different calls
//    Timestamp newStamp = new Timestamp(System.currentTimeMillis());

}
