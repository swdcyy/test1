package com.yxcorp.gifshow.share.OperationFactoryAdapter;
import mhc.v1;
import com.yxcorp.gifshow.share.OperationFactoryAdapter$b;
import nsd.u;
import com.yxcorp.gifshow.share.OperationFactoryAdapter$a;
import msd.l;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.share.OperationFactoryAdapter$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import mhc.p1;
import mhc.w;
import java.util.Collection;
import com.yxcorp.gifshow.share.OperationFactoryAdapter$c;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;

public abstract class OperationFactoryAdapter implements v1	// class@001b57
{
    public final l a;
    public static final OperationFactoryAdapter$a b;
    public static final List c;
    public static final OperationFactoryAdapter$b d;

    static {
       OperationFactoryAdapter.d = new OperationFactoryAdapter$b(null);
       OperationFactoryAdapter.b = new OperationFactoryAdapter$a(null);
       KwaiOp[] kwaiOpArray = new KwaiOp[12];
       kwaiOpArray[0] = KwaiOp.LIVE_SHARE_FOLLOWER;
       kwaiOpArray[1] = KwaiOp.FORWARD_IMFRIEND;
       kwaiOpArray[2] = KwaiOp.FORWARD_WECHAT_FRIEND;
       kwaiOpArray[3] = KwaiOp.FORWARD_WECHAT_MOMENT;
       kwaiOpArray[4] = KwaiOp.FORWARD_QQ;
       kwaiOpArray[5] = KwaiOp.FORWARD_QZONE;
       kwaiOpArray[6] = KwaiOp.FORWARD_WEIBO;
       kwaiOpArray[7] = KwaiOp.FORWARD_FACEBOOK;
       kwaiOpArray[8] = KwaiOp.FORWARD_INS;
       kwaiOpArray[9] = KwaiOp.FORWARD_YOUTUBE;
       kwaiOpArray[10] = KwaiOp.COPY_LINK;
       kwaiOpArray[11] = KwaiOp.HIGH_QUALITY_FEEDBACK;
       OperationFactoryAdapter.c = CollectionsKt__CollectionsKt.L(kwaiOpArray);
    }
    public void OperationFactoryAdapter(){
       super(null, 1, null);
    }
    public void OperationFactoryAdapter(l p0){
       super();
       this.a = p0;
    }
    public void OperationFactoryAdapter(l p0,int p1,u p2){
       OperationFactoryAdapter$1 u1 = (p1 & 0x01)? new OperationFactoryAdapter$1(OperationFactoryAdapter.d): null;
       super(u1);
       return;
    }
    public static final OperationFactoryAdapter c(){
       Object obj = PatchProxy.apply(null, null, OperationFactoryAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OperationFactoryAdapter.d.a();
    }
    public final List a(OperationModel p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, OperationFactoryAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       ArrayList uArrayList = new ArrayList();
       obj = this.b(p0).iterator();
       while (obj.hasNext()) {
          p1 op1 = obj.next();
          if (op1 instanceof p1) {
             if (!op1.Q0(p0)) {
             label_0047 :
                op1 = null;
             }
          }else if(op1 instanceof w && op1.Q0(p0)){
          }
          if (op1 != null) {
             uArrayList.add(op1);
          }
       }
       OperationFactoryAdapter ta = this.a;
       if (ta != null) {
          return CollectionsKt___CollectionsKt.f5(uArrayList, new OperationFactoryAdapter$c(ta));
       }
       return uArrayList;
    }
    public abstract List b(OperationModel p0);
}
