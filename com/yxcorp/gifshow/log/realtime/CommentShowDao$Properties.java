package com.yxcorp.gifshow.log.realtime.CommentShowDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;

public class CommentShowDao$Properties	// class@001b2b
{
    public static final Property Content;
    public static final Property ExpTag;
    public static final Property Id;
    public static final Property PhotoId;
    public static final Property UserId;

    static {
       Property property = new Property(0, Long.class, "id", true, "_id");
       CommentShowDao$Properties.Id = v6;
       Property property1 = new Property(1, String.class, "expTag", false, "EXP_TAG");
       CommentShowDao$Properties.ExpTag = property;
       Property property2 = new Property(2, String.class, "photoId", false, "PHOTO_ID");
       CommentShowDao$Properties.PhotoId = property;
       property1 = new Property(3, String.class, "userId", false, "USER_ID");
       CommentShowDao$Properties.UserId = property;
       property2 = new Property(4, byte[].class, "content", false, "CONTENT");
       CommentShowDao$Properties.Content = property;
    }
    public void CommentShowDao$Properties(){
       super();
    }
}
