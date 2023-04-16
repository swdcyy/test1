package fd1.h;
import lf3.g;
import fd1.l;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveQuestionnaire;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import va1.b0;
import ekd.k1;
import java.util.Random;
import java.lang.StringBuilder;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import fd1.k;
import java.lang.Runnable;
import lf3.f;

public final class h implements g	// class@0022f4
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       long l;
       h b = this.b;
       SCLiveQuestionnaire sCLiveQuesti = p0;
       Objects.requireNonNull(b);
       SCLiveQuestionnaire questionnair = sCLiveQuesti.questionnaireId;
       SCLiveQuestionnaire userWatchMin = sCLiveQuesti.userWatchMinDurationMs;
       SCLiveQuestionnaire userWatchMax = sCLiveQuesti.userWatchMaxDurationMs;
       SCLiveQuestionnaire isTest = sCLiveQuesti.isTest;
       SCLiveQuestionnaire bizType = sCLiveQuesti.bizType;
       sCLiveQuesti = sCLiveQuesti.priority;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{questionnair,Long.valueOf(userWatchMin),Long.valueOf(userWatchMax),Boolean.valueOf(isTest),Integer.valueOf(bizType),Integer.valueOf(sCLiveQuesti)};
          if (!PatchProxy.applyVoid(objArray, b, ol, "4")) {
          label_0052 :
             if (!b0.a()) {
                l = userWatchMax - userWatchMin;
                long l1 = (l - null > 0)? (long)k1.b.nextInt((int)l) + userWatchMin: userWatchMin;
                String str = "liveQuestionnaire_"+System.currentTimeMillis();
                String str1 = str;
                b.f0(LiveLogTag.LIVE_QUESTIONNAIRE, "receive questionnaire message questionnaire", "questionnaireId", questionnair, "minDelayTimeMs", Long.valueOf(userWatchMin), "maxDelayTimeMs", Long.valueOf(userWatchMax), "delay_bizId", l1+" "+str);
                String str2 = str1;
                k ok = new k(b, str2, questionnair, isTest, bizType, sCLiveQuesti);
                k1.s(l, b, l1);
             }
          }
       }else {
          goto label_0052 ;
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
