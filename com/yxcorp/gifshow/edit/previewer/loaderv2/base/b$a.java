package com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import c26.c;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;

public final class b$a implements c	// class@001b34
{
    public EditorSdk2V2$VideoEditorProject a;
    public int b;
    public int c;
    public Exception d;
    public KwaiMvParam e;
    public AE2Project f;
    public String g;
    public String h;
    public EditorSdk2MvCreationResult i;
    public boolean j;
    public AE2Project k;
    public Boolean l;
    public ImmutableArray m;
    public ImmutableArray n;
    public boolean o;
    public boolean p;
    public String q;
    public boolean r;
    public String s;

    public void b$a(){
       super();
       this.l = Boolean.FALSE;
       this.o = false;
       this.p = false;
    }
    public AE2Project a(){
       return this.f;
    }
    public AE2Project b(){
       return this.k;
    }
    public boolean c(){
       return this.r;
    }
    public KwaiMvParam d(){
       return this.e;
    }
    public boolean e(){
       return this.p;
    }
    public boolean f(){
       return this.o;
    }
    public EditorSdk2MvCreationResult g(){
       return this.i;
    }
    public EditorSdk2V2$VideoEditorProject getProject(){
       return this.a;
    }
    public String getTemplateId(){
       return this.q;
    }
    public String getTemplateType(){
       return this.s;
    }
    public Exception h(){
       return this.d;
    }
    public int i(){
       return this.c;
    }
    public int j(){
       return this.b;
    }
    public void k(EditorSdk2V2$VideoEditorProject p0){
       this.a = p0;
    }
    public String toString(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          StringBuilder str = "project null ";
          b$a td = this.d;
          String str1 = (td == null)? "": td.getMessage();
          return str+str1;
       }else if(!obj.trackAssetsSize()){
          return "project track assets empty";
       }else {
          return "project first track asset "+this.a.trackAssets(0).assetPath();
       }
    }
}
