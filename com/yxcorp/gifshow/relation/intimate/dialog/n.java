package com.yxcorp.gifshow.relation.intimate.dialog.n;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import v9c.a;
import java.lang.String;
import q87.c;

public final class n implements g	// class@0018f9
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       if (!p0.booleanValue()) {
          Object[] objArray = new Object[0];
          a.C().t("IntimateRelationSuccessDialog", "launchPostMediaScene: response info is illegal", objArray);
       }
       return;
    }
}
