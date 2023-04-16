package com.yxcrop.gifshow.v3.editor.subtitle_v2.repo.SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.regex.Pattern;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2 extends Lambda implements a	// class@000ae9
{
    public static final SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2 INSTANCE;

    static {
       SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2.INSTANCE = new SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2();
    }
    public void SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Pattern invoke(){
       Object obj = PatchProxy.apply(null, this, SubtitleRepoUtils$sRemuxNotSupportAudioPattern$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Pattern.compile(".*\\.\(wma|aac|flac|wav|ogg|ape\)$", 2);
    }
}
