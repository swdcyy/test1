package com.yxcorp.gifshow.log.realtime.OperationDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;

public class OperationDao$Properties	// class@001b35
{
    public static final Property Content;
    public static final Property Id;
    public static final Property Is_delayed_log;

    static {
       Property property = new Property(0, Long.class, "id", true, "_id");
       OperationDao$Properties.Id = v6;
       Property property1 = new Property(1, String.class, "content", false, "CONTENT");
       OperationDao$Properties.Content = property;
       Property property2 = new Property(2, Boolean.class, "is_delayed_log", false, "IS_DELAYED_LOG");
       OperationDao$Properties.Is_delayed_log = property;
    }
    public void OperationDao$Properties(){
       super();
    }
}
