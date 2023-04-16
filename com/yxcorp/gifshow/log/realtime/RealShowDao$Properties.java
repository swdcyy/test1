package com.yxcorp.gifshow.log.realtime.RealShowDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;

public class RealShowDao$Properties	// class@001b38
{
    public static final Property Content;
    public static final Property Id;
    public static final Property Is_delayed_log;
    public static final Property Llsid;

    static {
       Property property = new Property(0, Long.class, "id", true, "_id");
       RealShowDao$Properties.Id = v6;
       Property property1 = new Property(1, Long.class, "llsid", false, "LLSID");
       RealShowDao$Properties.Llsid = property;
       Property property2 = new Property(2, byte[].class, "content", false, "CONTENT");
       RealShowDao$Properties.Content = property;
       property1 = new Property(3, Boolean.class, "is_delayed_log", false, "IS_DELAYED_LOG");
       RealShowDao$Properties.Is_delayed_log = property;
    }
    public void RealShowDao$Properties(){
       super();
    }
}
