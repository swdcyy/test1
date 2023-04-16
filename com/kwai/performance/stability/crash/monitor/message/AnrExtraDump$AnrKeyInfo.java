package com.kwai.performance.stability.crash.monitor.message.AnrExtraDump$AnrKeyInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class AnrExtraDump$AnrKeyInfo implements Serializable	// class@0011f1
{
    public int anrRecordCpu;
    public int anrRecordWall;
    public int wall1000;
    public int wall500;
    public int wall5000;

    public void AnrExtraDump$AnrKeyInfo(){
       super();
       this.wall5000 = 0;
       this.wall1000 = 0;
       this.wall500 = 0;
       this.anrRecordWall = -1;
       this.anrRecordCpu = -1;
    }
    public String toString(){
       StringBuilder str2;
       String str = 1;
       String str1 = "";
       if (this.wall5000 != null) {
          str2 = "";
          if (this.wall5000 > str) {
             str1 = "���";
          }
          return str2+str1+"��ʷ��ʱ��Ϣ���غ�ʱ";
       }else if(this.wall1000 != null){
          str2 = "";
          if (this.wall1000 > str) {
             str1 = this.wall1000+" ��";
          }
          return str2+str1+"��ʷ��ʱ��Ϣ���ں�ʱ";
       }else if(this.wall500 != null){
          str2 = "";
          if (this.wall500 > str) {
             str1 = this.wall500+" ��";
          }
          return str2+str1+"��ʷ��ʱ���ڿ���";
       }else {
          return str1;
       }
    }
}
