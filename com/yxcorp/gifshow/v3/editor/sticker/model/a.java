package com.yxcorp.gifshow.v3.editor.sticker.model.a;
import ptc.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a implements a	// class@001276
{
    public String b;
    public String c;
    public long d;

    public void a(String p0,String p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public long F2(){
       return this.d;
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.b, this.c, this.F2());
    }
    public Object clone(){
       return this.a();
    }
    public a clone(){
       return this.a();
    }
    public String getDecorationName(){
       return this.b;
    }
    public int getEditStickerType(){
       return 2;
    }
    public String getOutputFilePath(){
       return this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LocalFileRenderViewDrawerDataProvider{mStickerId=\'"+this.b+'''+", mOutputFilePath=\'"+this.c+'''+", mAnimatedSubAssetId="+this.d+'}';
    }
}
