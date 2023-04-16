package com.kuaishou.live.core.show.test.LiveResourceFileSearchViewController$onBind$1;
import android.view.View$OnClickListener;
import il2.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import ftd.z1;
import java.util.concurrent.CancellationException;
import ftd.z1$a;
import ftd.k0;
import ftd.l0;
import com.kuaishou.live.core.show.test.LiveResourceFileSearchViewController$onBind$1$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;

public final class LiveResourceFileSearchViewController$onBind$1 implements View$OnClickListener	// class@001192
{
    public final k b;

    public void LiveResourceFileSearchViewController$onBind$1(k p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       object oobject;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceFileSearchViewController$onBind$1.class, "1")) {
          return;
       }
       int i = 0;
       LiveResourceFileSearchViewController$onBind$1 oonBind$1 = (!this.b.c.getText().toString().length())? 1: null;
       String str = "ÎÞÄÚÈÝ";
       if (oonBind$1) {
          this.b.d.setText(str);
       }else {
          LiveResourceFileUtil$LiveResourceFileType[] liveResource = LiveResourceFileUtil$LiveResourceFileType.values();
          int len = liveResource.length;
          while (true) {
             if (i < len) {
                oobject = liveResource[i];
                if (a.g(oobject.mType, this.b.c.getText().toString())) {
                label_0051 :
                   if (oobject != null) {
                      Ref$ObjectRef objectRef = new Ref$ObjectRef();
                      LiveResourceFileUtil$LiveResourceFileType mFilePathInf = oobject.mFilePathInfo;
                      a.o(mFilePathInf, "resourceType.mFilePathInfo");
                      objectRef.element = new File(mFilePathInf.b());
                      k e = this.b.e;
                      if (e != null) {
                         z1$a.b(e, null, 1, null);
                      }
                      this.b.e = a.f(l0.b(), null, null, new LiveResourceFileSearchViewController$onBind$1$1(this, objectRef, null), 3, null);
                      break ;
                   }else {
                      this.b.d.setText(str);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                oobject = null;
                goto label_0051 ;
             }
          }
       }
       return;
    }
}
