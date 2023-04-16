package com.yxcorp.gifshow.log.realtime.CoverShowDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;

public class CoverShowDao$Properties	// class@001b2e
{
    public static final Property Content;
    public static final Property Id;
    public static final Property Llsid;
    public static final Property LlsidFirstPage;

    static {
       Property property = new Property(0, Long.class, "id", true, "_id");
       CoverShowDao$Properties.Id = v6;
       Property property1 = new Property(1, Long.class, "llsid", false, "LLSID");
       CoverShowDao$Properties.Llsid = property;
       Property property2 = new Property(2, byte[].class, "content", false, "CONTENT");
       CoverShowDao$Properties.Content = property;
       property1 = new Property(3, Long.class, "llsidFirstPage", false, "LLSID_FIRST_PAGE");
       CoverShowDao$Properties.LlsidFirstPage = property;
    }
    public void CoverShowDao$Properties(){
       super();
    }
}
