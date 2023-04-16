package com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$a;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public class MagicEmojiPageConfig$b	// class@000feb
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final String e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public CameraPageType j;
    public boolean k;
    public boolean l;
    public long m;
    public MagicEmoji$MagicFace n;
    public boolean o;
    public List p;
    public String q;
    public boolean r;
    public boolean s;
    public WishMagicInfo t;
    public boolean u;
    public String v;
    public String w;
    public int x;
    public int y;
    public int z;

    public void MagicEmojiPageConfig$b(String p0){
       super();
       this.l = true;
       this.s = false;
       this.u = true;
       this.v = "";
       this.y = 0;
       this.e = p0;
    }
    public static MagicEmojiPageConfig$b c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmojiPageConfig$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicEmojiPageConfig$b(p0);
    }
    public MagicEmojiPageConfig a(){
       Object obj = PatchProxy.apply(null, this, MagicEmojiPageConfig$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicEmojiPageConfig(this, null);
    }
    public String b(){
       return this.e;
    }
    public MagicEmojiPageConfig$b d(boolean p0){
       this.s = p0;
       return this;
    }
    public MagicEmojiPageConfig$b e(boolean p0){
       this.f = p0;
       return this;
    }
    public MagicEmojiPageConfig$b f(int p0){
       this.h = p0;
       return this;
    }
    public MagicEmojiPageConfig$b g(boolean p0){
       this.l = p0;
       return this;
    }
    public MagicEmojiPageConfig$b h(boolean p0){
       this.g = p0;
       return this;
    }
    public MagicEmojiPageConfig$b i(boolean p0){
       this.b = p0;
       return this;
    }
    public MagicEmojiPageConfig$b j(CameraPageType p0){
       this.j = p0;
       return this;
    }
    public MagicEmojiPageConfig$b k(boolean p0){
       this.u = p0;
       return this;
    }
    public MagicEmojiPageConfig$b l(String p0){
       this.v = p0;
       return this;
    }
    public MagicEmojiPageConfig$b m(MagicEmoji$MagicFace p0){
       this.n = p0;
       return this;
    }
    public MagicEmojiPageConfig$b n(String p0){
       this.q = p0;
       return this;
    }
}
