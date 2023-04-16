package com.kuaishou.merchant.live.cart.onsale.audience.ultron.UltronDataSourceController$registerSignalMessage$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k34.o;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.CommodityCardMessage$CommodityCardChange;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UltronDataSourceController$registerSignalMessage$3 extends FunctionReferenceImpl implements l	// class@00197e
{
    public static final UltronDataSourceController$registerSignalMessage$3 INSTANCE;

    static {
       UltronDataSourceController$registerSignalMessage$3.INSTANCE = new UltronDataSourceController$registerSignalMessage$3();
    }
    public void UltronDataSourceController$registerSignalMessage$3(){
       super(1, o.class, "parse", "parse\(Lcom/kuaishou/merchant/message/nano/CommodityCardMessage$CommodityCardChange;\)Lcom/kuaishou/merchant/live/cart/onsale/audience/CommodityCardChangeInfo;", 0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final o invoke(CommodityCardMessage$CommodityCardChange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UltronDataSourceController$registerSignalMessage$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.a(p0);
    }
}
