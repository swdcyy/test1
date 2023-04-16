package com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController$levelUpListener$1;
import xx2.e;
import com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController;
import java.lang.Object;
import xx2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qs5.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.plugin.dva.work.c;
import android.os.SystemClock;
import com.kuaishou.live.common.core.basic.tools.g$c;
import com.kuaishou.live.core.voiceparty.userlevel.levelup.LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.StringBuilder;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import java.math.BigInteger;
import com.kuaishou.live.common.core.basic.tools.g$d$a;
import java.util.Arrays;
import java.io.File;
import wkd.b;
import j80.c;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.common.core.basic.tools.g$d;
import wx2.d;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.g$a;
import com.kuaishou.live.common.core.basic.tools.g;
import java.util.Map;
import xx2.d;

public final class LevelUpNoticeViewController$levelUpListener$1 implements e	// class@001ab8
{
    public final LevelUpNoticeViewController a;

    public void LevelUpNoticeViewController$levelUpListener$1(LevelUpNoticeViewController p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       c a;
       g$d$a uod$a;
       File uFile;
       byte[] bytes;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LevelUpNoticeViewController$levelUpListener$1.class, str)) {
          return;
       }
       a.p(p0, "notice");
       String str1 = "live_anchor_plugin";
       if (!d.d(str1)) {
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "onLevelUpNotice failed because plugin is not loaded");
          d.g(str1, 40);
          return;
       }else {
          LevelUpNoticeViewController$levelUpListener$1 ta = this.a;
          if ((SystemClock.uptimeMillis() - ta.k) - (long)3000 < 0) {
             return;
          }
          ta.k = SystemClock.uptimeMillis();
          LevelUpNoticeViewController l = this.a.l;
          if (l != null) {
             l.a();
          }
          ta = this.a;
          LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1 olevelUpList = new LevelUpNoticeViewController$levelUpListener$1$onLevelUpNotice$1(this, p0);
          Objects.requireNonNull(ta);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          LevelUpNoticeViewController levelUpNotic = LevelUpNoticeViewController.class;
          g$c uoc = PatchProxy.applyTwoRefs(p0, olevelUpList, ta, levelUpNotic, "3");
          if (uoc != patchProxyRe) {
          }else {
             a = p0.a;
             ArrayList uArrayList = new ArrayList(u.Y(a, 10));
             Iterator iterator = a.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getUrl());
             }
             int i = 0;
             String[] stringArray = new String[i];
             Object[] objArray = uArrayList.toArray(stringArray);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             String str2 = p0.c()+' '+p0.a()+' '+p0.b();
             if (str2 != null) {
                try{
                   MessageDigest instance = MessageDigest.getInstance("MD5");
                   try{
                      bytes = str2.getBytes(Charset.forName("utf-8"));
                   }catch(java.nio.charset.UnsupportedCharsetException e0){
                      bytes = str2.getBytes();
                   }
                   instance.update(bytes);
                   Object[] objArray1 = new Object[]{new BigInteger(1, instance.digest())};
                   str2 = (String.format("%1$032X", objArray1)).toLowerCase();
                }catch(java.security.NoSuchAlgorithmException e0){
                }
             }else {
                str2 = null;
             }
          }
          ta.l = uoc;
          return;
       }
    }
    public void b(Map p0){
       d.a(this, p0);
    }
}
