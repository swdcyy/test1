package com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.StringWriter;
import java.util.Locale;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Boolean;

public class PlayerConfigDebugInfo	// class@0012e7
{
    public boolean collectFinish;
    public String hdrType;
    public String hodorCacheInfo;
    public String inputUrl;
    public String kpMidInfo;
    public String mediaCodecInfo;
    public int playIndex;
    public boolean playerAsyncStreamClose;
    public int playerAudioJoysound;
    public int playerEnableSr;
    public int playerMaxBufDurMs;
    public boolean playerStartOnPrepared;
    public String playerVeSrInfo;
    public String playerVideoFilterName;
    public int playerVideoStereoType;
    public int sessionId;
    public static final String Formatter_Boolean = "%s : %b\n";
    public static final String Formatter_Int = "%s : %d\n";
    public static final String Formatter_Single_String = "%s\n";
    public static final String Formatter_String = "%s : %s\n";
    public static final String Formatter_Title = ">>> %s <<<\n";
    public static String KpMidVersion = "None";

    public void PlayerConfigDebugInfo(){
       super();
    }
    public String getPrettySingleText(){
       StringWriter obj = PatchProxy.apply(null, this, PlayerConfigDebugInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringWriter();
       Locale uS = Locale.US;
       Object[] objArray = new Object[]{"player"};
       obj.append(String.format(uS, ">>> %s <<<\n", objArray));
       objArray = new Object[]{this.kpMidInfo};
       obj.append(String.format(uS, "%s\n", objArray));
       Object[] objArray1 = new Object[]{"max_buffer_dur_ms",Integer.valueOf(this.playerMaxBufDurMs)};
       obj.append(String.format(uS, "%s : %d\n", objArray1));
       objArray1 = new Object[]{"start_on_prepared",Boolean.valueOf(this.playerStartOnPrepared)};
       obj.append(String.format(uS, "%s : %b\n", objArray1));
       objArray1 = new Object[]{"async_close",Boolean.valueOf(this.playerAsyncStreamClose)};
       obj.append(String.format(uS, "%s : %b\n", objArray1));
       objArray1 = new Object[]{"v_filter_name",this.playerVideoFilterName};
       obj.append(String.format(uS, "%s : %s\n", objArray1));
       objArray1 = new Object[]{"v_stereo_type",Integer.valueOf(this.playerVideoStereoType)};
       obj.append(String.format(uS, "%s : %d\n", objArray1));
       objArray1 = new Object[]{"hdr_type",this.hdrType};
       obj.append(String.format(uS, "%s : %s\n", objArray1));
       objArray1 = new Object[]{"ve_sr_info",this.playerVeSrInfo};
       obj.append(String.format(uS, "%s : %s\n", objArray1));
       objArray1 = new Object[]{"a_joysound",Integer.valueOf(this.playerAudioJoysound)};
       obj.append(String.format(uS, "%s : %d\n", objArray1));
       obj.append("\n");
       Object[] objArray2 = new Object[]{"Hodor"};
       obj.append(String.format(uS, ">>> %s <<<\n", objArray2));
       obj.append(this.hodorCacheInfo);
       obj.append("\n");
       objArray2 = new Object[]{"HWDecode"};
       obj.append(String.format(uS, ">>> %s <<<\n", objArray2));
       objArray2 = new Object[]{"mediaCodecInfo",this.mediaCodecInfo};
       obj.append(String.format(uS, "%s : %s\n", objArray2));
       obj.append("\n");
       objArray1 = new Object[]{"DetailVersion"};
       obj.append(String.format(uS, ">>> %s <<<\n", objArray1));
       Object[] objArray3 = new Object[]{"Player","5.3.7.15.3854.dc0ae64.WithAp.ap-v5.15.WithWebrtc.ffbin-a67802ca.ffabi-30d6bc2.WithAemonPlayer.ef0740a.WithBuiltInAemon.4589"};
       obj.append(String.format(uS, "%s : %s\n", objArray3));
       objArray3 = new Object[]{"Hodor","5.3.7.15.3854.dc0ae64.ffbin-a67802ca.ffabi-30d6bc2.4589"};
       obj.append(String.format(uS, "%s : %s\n", objArray3));
       objArray = new Object[]{"KpMid",PlayerConfigDebugInfo.KpMidVersion};
       obj.append(String.format(uS, "%s : %s\n", objArray));
       return obj.toString();
    }
}
