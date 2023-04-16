package com.kwai.library.wolverine.entity.ScoreConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ScoreConfig implements Serializable	// class@000abc
{
    public final int score;

    public void ScoreConfig(int p0){
       super();
       this.score = p0;
    }
    public static ScoreConfig copy$default(ScoreConfig p0,int p1,int p2,Object p3){
       ScoreConfig score;
       if (p2 & 0x01) {
          score = p0.score;
       }
       return p0.copy(score);
    }
    public final int component1(){
       return this.score;
    }
    public final ScoreConfig copy(int p0){
       return new ScoreConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ScoreConfig && this.score == p0.score)) {
          return true;
       }
       return false;
    }
    public final int getScore(){
       return this.score;
    }
    public int hashCode(){
       return this.score;
    }
    public String toString(){
       return "ScoreConfig\(score="+this.score+"\)";
    }
}
