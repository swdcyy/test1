package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$d;
import ppc.m;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import brd.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Bitmap;
import faa.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$VideoCoverDraftEmptyException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;

public class VideoCoverEditorPresenter$d implements m	// class@000e2f
{
    public final VideoCoverEditorPresenter b;

    public void VideoCoverEditorPresenter$d(VideoCoverEditorPresenter p0){
       this.b = p0;
       super();
    }
    public double Pf(){
       return this.b.S;
    }
    public a0 Sd(){
       Object obj = PatchProxy.apply(null, this, VideoCoverEditorPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Z8(false);
    }
    public List V9(){
       return null;
    }
    public String Yf(){
       EditTextBaseElementData obj = PatchProxy.apply(null, this, VideoCoverEditorPresenter$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.Y8();
       if (obj != null) {
          return obj.l();
       }
       return null;
    }
    public Bitmap getCover(){
       Object[] objArray = null;
       Cover obj = PatchProxy.apply(objArray, this, VideoCoverEditorPresenter$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("VideoCoverEditorPresenter", "getCover", objArray1);
       obj = this.b.y.v();
       if (obj != null && !TextUtils.x(obj.getOriginalFrameFile())) {
          objArray = DraftFileManager.E().z(obj.getOriginalFrameFile(), this.b.y);
       }
       Bitmap uBitmap = this.b.V8(true, objArray);
       if (uBitmap != null) {
          boolean b = this.b.y.D();
          if (!b) {
             this.b.y.c0();
             this.b.a9();
             Object[] objArray2 = new Object[i];
             a.D().w("VideoCoverEditorPresenter", "getCover was not editing", objArray2);
          }
          if (this.b.y.E()) {
             ExceptionHandler.handleCaughtException(new VideoCoverEditorPresenter$VideoCoverDraftEmptyException("getCover item is null should not happen"));
             Object[] objArray3 = new Object[i];
             a.D().t("VideoCoverEditorPresenter", "getCover item is null should not happen", objArray3);
             return uBitmap;
          }else {
             this.b.y.k().e(this.b.y.M(uBitmap));
             if (!b) {
                this.b.y.f();
             }
          }
       }
       return uBitmap;
    }
    public String k8(){
       EditTextBaseElementData obj = PatchProxy.apply(null, this, VideoCoverEditorPresenter$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.Y8();
       if (obj != null) {
          return obj.B0();
       }
       return null;
    }
}
