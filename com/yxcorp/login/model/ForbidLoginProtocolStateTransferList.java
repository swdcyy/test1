package com.yxcorp.login.model.ForbidLoginProtocolStateTransferList;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.login.model.ForbidLoginProtocolStateTransferList$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.util.Objects;
import h3b.b;
import java.lang.StringBuilder;
import q87.c;
import o56.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.n0;

public class ForbidLoginProtocolStateTransferList implements Serializable	// class@001af5
{
    public List mChannels;

    public void ForbidLoginProtocolStateTransferList(){
       super();
       this.mChannels = new ArrayList();
    }
    public boolean isInForbiddenList(){
       Object[] objArray;
       boolean b;
       boolean b1;
       Object[] objArray1;
       Object[] objArray2;
       ForbidLoginProtocolStateTransferList$a uoa = ForbidLoginProtocolStateTransferList$a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ForbidLoginProtocolStateTransferList obj = PatchProxy.apply(null, this, ForbidLoginProtocolStateTransferList.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.mChannels;
       if (obj == null || obj.isEmpty()) {
          objArray = new Object[0];
          b.C().w("ForbidLoginProtocolStateTransfer", "mChannels == null || mChannels.isEmpty\(\)", objArray);
          return 0;
       }else {
          Iterator iterator = this.mChannels.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ForbidLoginProtocolStateTransferList$a uoa1 = iterator.next();
                Objects.requireNonNull(uoa1);
                ForbidLoginProtocolStateTransferList$a obj1 = PatchProxy.apply(null, uoa1, uoa, "2");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   objArray1 = new Object[0];
                   b.C().w("ForbidLoginProtocolStateTransfer", "product = "+uoa1.product, objArray1);
                   obj1 = uoa1.product;
                   if (obj1 != 3) {
                      if (obj1 == true) {
                         objArray2 = new Object[0];
                         b.C().w("ForbidLoginProtocolStateTransfer", "product = 1 return true", objArray2);
                      }else {
                         objArray2 = new Object[0];
                         b.C().w("ForbidLoginProtocolStateTransfer", "product = 2 return false", objArray2);
                         b = false;
                      }
                   }
                   b = true;
                }
                if (b) {
                   obj1 = PatchProxy.apply(null, uoa1, uoa, "1");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      objArray1 = new Object[0];
                      b.C().w("ForbidLoginProtocolStateTransfer", "channel = "+uoa1.channel+"; curr channel = "+a.k, objArray1);
                      if (TextUtils.isEmpty(uoa1.channel)) {
                         b1 = false;
                      }else {
                         b1 = (n0.d(uoa1.channel)).equals(n0.d(a.k));
                         objArray1 = new Object[0];
                         b.C().w("ForbidLoginProtocolStateTransfer", "channel return "+b1, objArray1);
                      }
                   }
                   if (b1) {
                      break ;
                   }
                }
             }else {
                objArray = new Object[0];
                b.C().w("ForbidLoginProtocolStateTransfer", "return false;", objArray);
                return 0;
             }
          }
          objArray = new Object[0];
          b.C().w("ForbidLoginProtocolStateTransfer", "channel.isHitProduct\(\) && channel.isHitChannel\(\)", objArray);
          return true;
       }
    }
}
