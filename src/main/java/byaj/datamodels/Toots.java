package byaj.datamodels;

import java.util.Date;

/**
 * Created by husb on 6/11/17.
 */
public class Toots {
    private long id;
    private String content;
    private String poster;
    private long posterId;
    private Date postDate;

    public long getId(){
        return id;
    }
    public void setId(long val){
        id = val;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String val){
        content = val;
    }
    public String getPoster(){
        return poster;
    }
    public void setPoster(String val){
        poster = val;
    }
    public long getPosterId(){
        return posterId;
    }
    public void setPosterId(long val){
        posterId = val;
    }
    public Date getPostDate(){
        return postDate;
    }
    public void setPostDate(Date val){
        postDate = val;
    }
}
