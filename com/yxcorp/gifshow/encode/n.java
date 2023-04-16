package com.yxcorp.gifshow.encode.n;
import ok.o;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.util.regex.Pattern;
import lnc.v5;
import java.lang.String;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class n implements o	// class@000d33
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final boolean apply(Object p0){
       return (v5.a().matcher(p0.assetPath()).matches() ^ 0x01);
    }
}
