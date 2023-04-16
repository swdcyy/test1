package g5b.i;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.util.HashMap;
import java.lang.Float;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import j4b.c;
import w3b.p;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.video.westeros.models.EffectDescription;

public final class i implements g	// class@002a83
{
    public final h b;

    public void i(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.entrySet().iterator();
       int i = 0;
       String str = "MagicEmojiSeekBar";
       while (p0.hasNext()) {
          Map$Entry uEntry = p0.next();
          String key = uEntry.getKey();
          Map map = tb.L.get(key);
          if (map == null || (map.get(MagicEmoji$SeekBarType.MAKEUP) == null && map.get(MagicEmoji$SeekBarType.SLIMMING) == null)) {
             HashMap hashMap = new HashMap();
             hashMap.put(MagicEmoji$SeekBarType.SLIMMING, uEntry.getValue());
             hashMap.put(MagicEmoji$SeekBarType.MAKEUP, uEntry.getValue());
             Object[] objArray = new Object[i];
             b.D().s(str, "Configs loaded "+key, objArray);
             tb.L.put(key, hashMap);
          }
       }
       Object[] objArray1 = new Object[i];
       b.D().s(str, "onEffectDescriptionUpdated after loaded ", objArray1);
       tb.c9(new c(null, p.b().c(tb.x.mPageIdentify)));
       return;
    }
}
