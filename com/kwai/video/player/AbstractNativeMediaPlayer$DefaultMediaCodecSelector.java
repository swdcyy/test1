package com.kwai.video.player.AbstractNativeMediaPlayer$DefaultMediaCodecSelector;
import com.kwai.video.player.AbstractNativeMediaPlayer$OnMediaCodecSelectListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Locale;
import java.util.ArrayList;
import android.media.MediaCodecList;
import android.media.MediaCodecInfo;
import com.kwai.video.player.KsMediaCodecInfo;
import java.util.Iterator;

public class AbstractNativeMediaPlayer$DefaultMediaCodecSelector implements AbstractNativeMediaPlayer$OnMediaCodecSelectListener	// class@000aa4
{
    public static final AbstractNativeMediaPlayer$DefaultMediaCodecSelector sInstance;

    static {
       AbstractNativeMediaPlayer$DefaultMediaCodecSelector.sInstance = new AbstractNativeMediaPlayer$DefaultMediaCodecSelector();
    }
    public void AbstractNativeMediaPlayer$DefaultMediaCodecSelector(){
       super();
    }
    public String onMediaCodecSelect(IMediaPlayer p0,String p1,int p2,int p3){
       ArrayList obj;
       object oobject = p1;
       if (PatchProxy.isSupport(AbstractNativeMediaPlayer$DefaultMediaCodecSelector.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AbstractNativeMediaPlayer$DefaultMediaCodecSelector.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       if (TextUtils.isEmpty(p1)) {
          return str;
       }else {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p2),Integer.valueOf(p3)};
          int i = 0;
          String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", objArray);
          obj = new ArrayList();
          int codecCount = MediaCodecList.getCodecCount();
          KsMediaCodecInfo int i1 = 0;
          while (i1 < codecCount) {
             MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i1);
             Object[] objArray1 = new Object[1];
             objArray1[i] = codecInfoAt.getName();
             String.format(Locale.US, "  found codec: %s", objArray1);
             if (!codecInfoAt.isEncoder()) {
                String[] supportedTyp = codecInfoAt.getSupportedTypes();
                if (supportedTyp != null) {
                   int len = supportedTyp.length;
                   int i2 = 0;
                   while (i2 < len) {
                      object oobject1 = supportedTyp[i2];
                      if (!TextUtils.isEmpty(oobject1)) {
                         Locale uS = Locale.US;
                         Object[] objArray2 = new Object[1];
                         objArray2[i] = oobject1;
                         String.format(uS, "    mime: %s", objArray2);
                         if (oobject1.equalsIgnoreCase(oobject)) {
                            KsMediaCodecInfo ksMediaCodec = KsMediaCodecInfo.setupCandidate(codecInfoAt, oobject);
                            if (ksMediaCodec != null) {
                               obj.add(ksMediaCodec);
                               objArray2 = new Object[2];
                               objArray2[i] = codecInfoAt.getName();
                               objArray2[1] = Integer.valueOf(ksMediaCodec.mRank);
                               String.format(uS, "candidate codec: %s rank=%d", objArray2);
                               ksMediaCodec.dumpProfileLevels(oobject);
                            }
                         }
                      }
                      i2 = i2 + 1;
                   }
                }
             }
             i1++;
          }
          if (obj.isEmpty()) {
             return str;
          }else {
             KsMediaCodecInfo ksMediaCodec1 = obj.get(i);
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                i1 = iterator.next();
                if (i1.mRank > ksMediaCodec1.mRank) {
                   ksMediaCodec1 = i1;
                }
             }
             if (ksMediaCodec1.mRank < 600) {
                Object[] i11 = new Object[]{ksMediaCodec1.mCodecInfo.getName()};
                String.format(Locale.US, "unaccetable codec: %s", i11);
                return str;
             }else {
                Object[] objArray3 = new Object[]{ksMediaCodec1.mCodecInfo.getName(),Integer.valueOf(ksMediaCodec1.mRank)};
                String.format(Locale.US, "selected codec: %s rank=%d", objArray3);
                return ksMediaCodec1.mCodecInfo.getName();
             }
          }
       }
    }
}
