package com.facebook.drawee.backends.pipeline.info.internal.ProducerStatus;
import java.lang.Enum;
import java.lang.String;
import com.facebook.drawee.backends.pipeline.info.internal.ProducerStatus$a;
import java.lang.Class;
import java.lang.Object;

public final class ProducerStatus extends Enum	// class@00107f
{
    public static final ProducerStatus[] $VALUES;
    public static final ProducerStatus CANCELED;
    public static final ProducerStatus ERROR;
    public static final ProducerStatus SUCCESS;

    static {
       ProducerStatus producerStat = new ProducerStatus("SUCCESS", 0);
       ProducerStatus.SUCCESS = producerStat;
       ProducerStatus producerStat1 = new ProducerStatus("ERROR", 1);
       ProducerStatus.ERROR = producerStat1;
       ProducerStatus producerStat2 = new ProducerStatus("CANCELED", 2);
       ProducerStatus.CANCELED = producerStat2;
       ProducerStatus[] producerStat3 = new ProducerStatus[]{producerStat,producerStat1,producerStat2};
       ProducerStatus.$VALUES = producerStat3;
    }
    public void ProducerStatus(String p0,int p1){
       super(p0, p1);
    }
    public static int convertProducerStatusToDecodeStatus(ProducerStatus p0){
       int i = ProducerStatus$a.a[p0.ordinal()];
       if (i == 1) {
          return 0;
       }
       int i1 = 2;
       if (i == i1) {
          return i1;
       }
       if (i != 3) {
          return -1;
       }
       return 1;
    }
    public static int convertProducerStatusToDownloadStatus(ProducerStatus p0){
       int i = ProducerStatus$a.a[p0.ordinal()];
       if (i == 1) {
          return 0;
       }
       int i1 = 2;
       if (i == i1) {
          return i1;
       }
       if (i != 3) {
          return -1;
       }
       return 1;
    }
    public static ProducerStatus valueOf(String p0){
       return Enum.valueOf(ProducerStatus.class, p0);
    }
    public static ProducerStatus[] values(){
       return ProducerStatus.$VALUES.clone();
    }
}
