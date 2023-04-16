package com.kwai.social.startup.reminder.util.IMConfigUtil$mCustomEmotionMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import com.kwai.social.startup.reminder.model.CustomEmotionIcon;
import java.lang.CharSequence;

public final class IMConfigUtil$mCustomEmotionMap$2 extends Lambda implements a	// class@0018da
{
    public static final IMConfigUtil$mCustomEmotionMap$2 INSTANCE;

    static {
       IMConfigUtil$mCustomEmotionMap$2.INSTANCE = new IMConfigUtil$mCustomEmotionMap$2();
    }
    public void IMConfigUtil$mCustomEmotionMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object[] objArray;
       HashMap obj = PatchProxy.apply(null, this, IMConfigUtil$mCustomEmotionMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       IMConfigInfo iMConfigInfo = IMConfigUtil.i.r();
       if (iMConfigInfo != null) {
          iMConfigInfo = iMConfigInfo.mCustomEmotionIcon;
          if (iMConfigInfo != null) {
             Set set = iMConfigInfo.entrySet();
             if (set != null) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   CustomEmotionIcon value = uEntry.getValue();
                   int i = 0;
                   CustomEmotionIcon uCustomEmoti = (key == null || !key.length())? 1: null;
                   if (!uCustomEmoti) {
                      uCustomEmoti = (value != null)? value.mIconUrl: null;
                      if (uCustomEmoti == null || !uCustomEmoti.length()) {
                         i = 1;
                      }
                      if (!i) {
                         obj.put(key, value.mIconUrl);
                      }
                   }
                }
             }
          }
       }
       return obj;
    }
}
