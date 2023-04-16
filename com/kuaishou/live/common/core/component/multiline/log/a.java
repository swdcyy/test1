package com.kuaishou.live.common.core.component.multiline.log.a;
import java.lang.String;

public class a	// class@0014ec
{

    public static String a(int p0){
       if (p0 == 3) {
          return "DETERMINE_MATCHING_FRIEND";
       }
       if (p0 == 4) {
          return "DETERMINE_MATCHING_RECO";
       }
       if (p0 == 5) {
          return "DIVERSION_OF_ATTACHMENT_MATCHING";
       }
       if (p0 != 6) {
          return "RANDOM_MATCHING";
       }
       return "MORE_ONLINE_JOIN";
    }
}
