package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3$fontConfigFetcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextFontRepoV3$fontConfigFetcher$2 extends Lambda implements a	// class@000bdd
{
    public static final TextFontRepoV3$fontConfigFetcher$2 INSTANCE;

    static {
       TextFontRepoV3$fontConfigFetcher$2.INSTANCE = new TextFontRepoV3$fontConfigFetcher$2();
    }
    public void TextFontRepoV3$fontConfigFetcher$2(){
       super(0);
    }
    public final RemoteFontRepo invoke(){
       Object obj = PatchProxy.apply(null, this, TextFontRepoV3$fontConfigFetcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemoteFontRepo();
    }
    public Object invoke(){
       return this.invoke();
    }
}
