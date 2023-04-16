package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$a;
import java.lang.Object;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import skd.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;

public class MagicFaceAdapter$a	// class@001bac
{
    public MagicEmojiFragment$Source a;
    public RecyclerView b;
    public a c;
    public MagicEmojiPageConfig d;
    public String e;
    public MagicFaceAdapter$c f;
    public a g;
    public int h;
    public boolean i;
    public boolean j;

    public void MagicFaceAdapter$a(){
       super();
       this.h = -1;
       this.i = false;
       this.j = false;
    }
    public MagicFaceAdapter a(){
       Object obj = PatchProxy.apply(null, this, MagicFaceAdapter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicFaceAdapter(this);
    }
    public MagicFaceAdapter$a b(String p0){
       this.e = p0;
       return this;
    }
    public MagicFaceAdapter$a c(a p0){
       this.c = p0;
       return this;
    }
    public MagicFaceAdapter$a d(RecyclerView p0){
       this.b = p0;
       return this;
    }
    public MagicFaceAdapter$a e(MagicFaceAdapter$c p0){
       this.f = p0;
       return this;
    }
    public MagicFaceAdapter$a f(MagicEmojiFragment$Source p0){
       this.a = p0;
       return this;
    }
}
