package com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam$a;
import java.lang.Object;
import com.yxcorp.gifshow.model.FreeTrafficDialogModel;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class FreeTrafficDialogParam$a	// class@001a9f
{
    public FreeTrafficDialogModel a;
    public String b;
    public int c;

    public void FreeTrafficDialogParam$a(){
       super();
       this.c = 0;
       this.a = new FreeTrafficDialogModel();
       Application uApplication = a.a().a();
       this.a.mTitle = uApplication.getString(0x7f101072);
       this.a.mActionString = uApplication.getString(0x7f101070);
       this.a.mOkString = uApplication.getString(0x7f101071);
       this.a.mActionUrl = WebEntryUrls.x;
       this.b = "Ä¬ÈÏµ¯´°";
    }
    public FreeTrafficDialogParam a(){
       Object obj = PatchProxy.apply(null, this, FreeTrafficDialogParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FreeTrafficDialogParam(this);
    }
    public FreeTrafficDialogParam$a b(int p0){
       this.c = p0;
       return this;
    }
}
