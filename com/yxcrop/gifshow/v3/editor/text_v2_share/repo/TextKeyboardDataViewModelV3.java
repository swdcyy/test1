package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3;
import androidx.lifecycle.ViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3$fontRepo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3$textTemplateRepoV3$2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3$designTemplateRepoV3$2;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3$templateRepo$2;
import lod.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.util.Objects;
import faa.a;
import q87.c;
import crd.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;

public final class TextKeyboardDataViewModelV3 extends ViewModel	// class@000be4
{
    public final p a;
    public final p b;
    public final p c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final p f;

    public void TextKeyboardDataViewModelV3(){
       super();
       this.a = s.c(TextKeyboardDataViewModelV3$fontRepo$2.INSTANCE);
       this.b = s.c(new TextKeyboardDataViewModelV3$textTemplateRepoV3$2(this));
       this.c = s.c(new TextKeyboardDataViewModelV3$designTemplateRepoV3$2(this));
       this.d = new AtomicBoolean(true);
       this.e = new AtomicBoolean(true);
       this.f = s.c(TextKeyboardDataViewModelV3$templateRepo$2.INSTANCE);
    }
    public final b o0(){
       Object obj = PatchProxy.apply(null, this, TextKeyboardDataViewModelV3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void onCleared(){
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, TextKeyboardDataViewModelV3.class, str)) {
          return;
       }
       super.onCleared();
       TextTemplateRepo textTemplate = this.q0();
       Objects.requireNonNull(textTemplate);
       if (!PatchProxy.applyVoid(objArray, textTemplate, TextTemplateRepo.class, "10")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().w("TextTemplateRepo", "release", objArray1);
          textTemplate.a.dispose();
          TextTemplateDownloadHelper textTemplate1 = textTemplate.f();
          Objects.requireNonNull(textTemplate1);
          if (!PatchProxy.applyVoid(objArray, textTemplate1, TextTemplateDownloadHelper.class, str)) {
             Object[] objArray2 = new Object[i];
             a.D().w("TextTemplateDownloadHelper", "release", objArray2);
             textTemplate1.b().d();
             textTemplate1.c.dispose();
          }
          textTemplate.b.dispose();
       }
       TextFontRepoV3 textFontRepo = this.p0();
       Objects.requireNonNull(textFontRepo);
       if (!PatchProxy.applyVoid(objArray, textFontRepo, TextFontRepoV3.class, "7")) {
          textFontRepo.a.dispose();
          textFontRepo.b().g();
       }
       return;
    }
    public final TextFontRepoV3 p0(){
       Object obj = PatchProxy.apply(null, this, TextKeyboardDataViewModelV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final TextTemplateRepo q0(){
       return this.f.getValue();
    }
    public final b r0(){
       Object obj = PatchProxy.apply(null, this, TextKeyboardDataViewModelV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
