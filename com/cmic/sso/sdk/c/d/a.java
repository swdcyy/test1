package com.cmic.sso.sdk.c.d.a;
import java.lang.String;
import java.lang.Object;

public class a	// class@000f53
{
    public int a;
    public String b;

    public void a(int p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static a a(int p0){
       String str = "�����쳣";
       switch (p0){
           case 0x18ed6:
             return new a(0x18ed6, str);
           case 0x18f4f:
             return new a(0x18f4f, "���ݽ����쳣");
           case 0x1906c:
             return new a(0x1906c, "���������л�ʧ��");
           case 0x30d59:
             return new a(0x30d59, "��¼��ʱ");
           case 0x30d67:
             return new a(0x30d67, "����ȡ�Žӿ�ʧ��");
           case 0x30d72:
             return new a(0x30d72, "EOF�쳣");
           default:
             return new a(p0, str);
       }
    }
    public int a(){
       return this.a;
    }
    public String b(){
       return this.b;
    }
}
