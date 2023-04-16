package com.yxcorp.gifshow.webview.bridge.GetAppListFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.yxcorp.gifshow.webview.bridge.GetAppListFunction$Result;
import qe6.b;
import com.kwai.yoda.function.FunctionResultParams;
import wkd.b;
import x96.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;
import com.yxcorp.gifshow.webview.bridge.GetAppListFunction$a;

public class GetAppListFunction extends c	// class@001703
{

    public void GetAppListFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       GetAppListFunction getAppListFu = GetAppListFunction.class;
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(getAppListFu)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, getAppListFu, "1")) {
             return;
          }
       }else {
          int i2 = this;
       }
       GetAppListFunction$Result result = new GetAppListFunction$Result();
       if (b.a()) {
          result.mResult = i1;
          List list = b.a(-587602830).a();
          result.mAppList = new ArrayList(list.size());
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             result.mAppList.add(new GetAppListFunction$a(iterator.next()));
          }
       }else {
          result.mResult = i;
       }
       this.l(p0, result, p1, p2, null, p4);
       return;
    }
}
