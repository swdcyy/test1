package com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import java.lang.Enum;
import com.yxcorp.gifshow.edit.previewer.loaderv2.q;
import java.lang.String;
import java.lang.Class;
import com.yxcorp.gifshow.edit.previewer.loaderv2.c0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.y;
import com.yxcorp.gifshow.edit.previewer.loaderv2.r;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.t;
import com.yxcorp.gifshow.edit.previewer.loaderv2.s;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d;
import com.yxcorp.gifshow.edit.previewer.loaderv2.KaraokeLoaderV2;
import com.yxcorp.gifshow.edit.previewer.loaderv2.n;
import com.yxcorp.gifshow.edit.previewer.loaderv2.MusicLoaderV2;
import com.yxcorp.gifshow.edit.previewer.loaderv2.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.x;
import com.yxcorp.gifshow.edit.previewer.loaderv2.e;
import pba.c;
import pba.e;
import com.yxcorp.gifshow.edit.previewer.loaderv2.k;
import com.yxcorp.gifshow.edit.previewer.loaderv2.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.u;
import com.yxcorp.gifshow.edit.previewer.loaderv2.w;
import com.yxcorp.gifshow.edit.previewer.loaderv2.p;
import pba.d;
import com.yxcorp.gifshow.edit.previewer.loaderv2.h;
import com.yxcorp.gifshow.edit.previewer.loaderv2.g;
import com.yxcorp.gifshow.edit.previewer.loaderv2.a0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.f;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Loader extends Enum	// class@001b30
{
    public final Class clazz;
    public static final Loader[] $VALUES;
    public static final Loader AEEffect;
    public static final Loader AEText;
    public static final Loader AiCut;
    public static final Loader Audio;
    public static final Loader Beauty;
    public static final Loader Body;
    public static final Loader CUSTOM;
    public static final Loader Clip;
    public static final Loader Effect;
    public static final Loader FaceMagic;
    public static final Loader Filter;
    public static final Loader HeightAndWidth;
    public static final Loader Karaoke;
    public static final Loader KaraokeLyric;
    public static final Loader Kuaishan;
    public static final Loader Makeup;
    public static final Loader Music;
    public static final Loader PhotoAsset;
    public static final Loader Recreation;
    public static final Loader Scrawl;
    public static final Loader TTS;
    public static final Loader TextStickerLyric;
    public static final Loader Theme;
    public static final Loader TrackAssetVolume;
    public static final Loader VideoAsset;
    public static final Loader VideoProject;

    static {
       Loader[] loaderArray = new Loader[26];
       Loader loader = new Loader("Kuaishan", 0, q.class);
       Loader.Kuaishan = loader;
       loaderArray[0] = loader;
       loader = new Loader("VideoAsset", 1, c0.class);
       Loader.VideoAsset = loader;
       loaderArray[1] = loader;
       loader = new Loader("TrackAssetVolume", 2, y.class);
       Loader.TrackAssetVolume = loader;
       loaderArray[2] = loader;
       loader = new Loader("PhotoAsset", 3, r.class);
       Loader.PhotoAsset = loader;
       loaderArray[3] = loader;
       loader = new Loader("VideoProject", 4, d0.class);
       Loader.VideoProject = loader;
       loaderArray[4] = loader;
       loader = new Loader("Recreation", 5, t.class);
       Loader.Recreation = loader;
       loaderArray[5] = loader;
       loader = new Loader("HeightAndWidth", 6, s.class);
       Loader.HeightAndWidth = loader;
       loaderArray[6] = loader;
       loader = new Loader("AiCut", 7, d.class);
       Loader.AiCut = loader;
       loaderArray[7] = loader;
       loader = new Loader("Karaoke", 8, KaraokeLoaderV2.class);
       Loader.Karaoke = loader;
       loaderArray[8] = loader;
       loader = new Loader("Filter", 9, n.class);
       Loader.Filter = loader;
       loaderArray[9] = loader;
       loader = new Loader("Music", 10, MusicLoaderV2.class);
       Loader.Music = loader;
       loaderArray[10] = loader;
       loader = new Loader("AEText", 11, c.class);
       Loader.AEText = loader;
       loaderArray[11] = loader;
       loader = new Loader("Theme", 12, x.class);
       Loader.Theme = loader;
       loaderArray[12] = loader;
       loader = new Loader("Audio", 13, e.class);
       Loader.Audio = loader;
       loaderArray[13] = loader;
       loader = new Loader("Clip", 14, c.class);
       Loader.Clip = loader;
       loaderArray[14] = loader;
       loader = new Loader("Effect", 15, e.class);
       Loader.Effect = loader;
       loaderArray[15] = loader;
       loader = new Loader("FaceMagic", 16, k.class);
       Loader.FaceMagic = loader;
       loaderArray[16] = loader;
       loader = new Loader("AEEffect", 17, a.class);
       Loader.AEEffect = loader;
       loaderArray[17] = loader;
       loader = new Loader("Scrawl", 18, u.class);
       Loader.Scrawl = loader;
       loaderArray[18] = loader;
       loader = new Loader("TextStickerLyric", 19, w.class);
       Loader.TextStickerLyric = loader;
       loaderArray[19] = loader;
       loader = new Loader("KaraokeLyric", 20, p.class);
       Loader.KaraokeLyric = loader;
       loaderArray[20] = loader;
       loader = new Loader("Beauty", 21, d.class);
       Loader.Beauty = loader;
       loaderArray[21] = loader;
       loader = new Loader("Makeup", 22, h.class);
       Loader.Makeup = loader;
       loaderArray[22] = loader;
       loader = new Loader("Body", 23, g.class);
       Loader.Body = loader;
       loaderArray[23] = loader;
       loader = new Loader("TTS", 24, a0.class);
       Loader.TTS = loader;
       loaderArray[24] = loader;
       loader = new Loader("CUSTOM", 25, f.class);
       Loader.CUSTOM = loader;
       loaderArray[25] = loader;
       Loader.$VALUES = loaderArray;
    }
    public void Loader(String p0,int p1,Class p2){
       super(p0, p1);
       this.clazz = p2;
    }
    public static Loader valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Loader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Loader.class, p0);
    }
    public static Loader[] values(){
       Object obj = PatchProxy.apply(null, null, Loader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Loader.$VALUES.clone();
    }
    public final Class getLoaderClazz(){
       return this.clazz;
    }
}
