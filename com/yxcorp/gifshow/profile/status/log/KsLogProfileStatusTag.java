package com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import v2c.e;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import v2c.d;

public final class KsLogProfileStatusTag extends Enum implements e	// class@0015b3
{
    public final String mName;
    public static final KsLogProfileStatusTag[] $VALUES;
    public static final KsLogProfileStatusTag$a Companion;
    public static final KsLogProfileStatusTag FRIEND_STATUS;
    public static final KsLogProfileStatusTag STATUS_HEADER;
    public static final KsLogProfileStatusTag STATUS_ITEM;
    public static final KsLogProfileStatusTag STATUS_PUBLISH;

    static {
       KsLogProfileStatusTag ksLogProfile1;
       KsLogProfileStatusTag[] ksLogProfile = new KsLogProfileStatusTag[]{ksLogProfile1,ksLogProfile1,ksLogProfile1,ksLogProfile1};
       ksLogProfile1 = new KsLogProfileStatusTag("STATUS_PUBLISH", 0, "Publish");
       KsLogProfileStatusTag.STATUS_PUBLISH = ksLogProfile1;
       ksLogProfile1 = new KsLogProfileStatusTag("STATUS_HEADER", 1, "Header");
       KsLogProfileStatusTag.STATUS_HEADER = ksLogProfile1;
       ksLogProfile1 = new KsLogProfileStatusTag("FRIEND_STATUS", 2, "Friend");
       KsLogProfileStatusTag.FRIEND_STATUS = ksLogProfile1;
       ksLogProfile1 = new KsLogProfileStatusTag("STATUS_ITEM", 3, "Item");
       KsLogProfileStatusTag.STATUS_ITEM = ksLogProfile1;
       KsLogProfileStatusTag.$VALUES = ksLogProfile;
       KsLogProfileStatusTag.Companion = new KsLogProfileStatusTag$a(null);
    }
    public void KsLogProfileStatusTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static KsLogProfileStatusTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogProfileStatusTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogProfileStatusTag.class, p0);
    }
    public static KsLogProfileStatusTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogProfileStatusTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogProfileStatusTag.$VALUES.clone();
    }
    public List a(String p0,String p1){
       return d.b(this, p0, p1);
    }
    public List appendTag(String p0){
       return d.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
