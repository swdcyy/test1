package com.kwai.feature.api.social.relation.model.ExploreFriendParams;
import java.io.Serializable;
import com.kwai.feature.api.social.relation.model.ExploreFriendParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class ExploreFriendParams implements Serializable	// class@0011b6
{
    public final boolean enableRedDotOptimizationWithCard;
    public final boolean enableStartContactsListActivity;
    public final String page2;
    public final int portalReco;
    public static final ExploreFriendParams$a Companion;
    public static final long serialVersionUID;

    static {
       ExploreFriendParams.Companion = new ExploreFriendParams$a(null);
    }
    public void ExploreFriendParams(boolean p0,boolean p1,String p2,int p3){
       a.p(p2, "page2");
       super();
       this.enableRedDotOptimizationWithCard = p0;
       this.enableStartContactsListActivity = p1;
       this.page2 = p2;
       this.portalReco = p3;
    }
    public void ExploreFriendParams(boolean p0,boolean p1,String p2,int p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = false;
       }
       if (p4 & 0x02) {
          p1 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
}
