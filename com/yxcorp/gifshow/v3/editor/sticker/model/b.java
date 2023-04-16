package com.yxcorp.gifshow.v3.editor.sticker.model.b;
import ptc.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b implements a	// class@001277
{
    public String b;
    public String c;
    public long d;
    public boolean e;

    public void b(StickerDetailInfo p0,String p1,long p2,boolean p3){
       super();
       this.b = p0.mStickerId;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void b(String p0,String p1,long p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public long F2(){
       return this.d;
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(this.b, this.c, this.d, this.e);
       return obj;
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
       int i = (this.e != null)? 4: 0;
       return i;
    }
    public String getOutputFilePath(){
       return this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StickerRenderViewDrawerDataProvider{mStickerId=\'"+this.b+'''+", mOutputFilePath=\'"+this.c+'''+", mAnimatedSubAssetId="+this.d+", mIsDynamicSticker="+this.e+'}';
    }
}
