import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Object;
import java.io.FileInputStream ;
import java.io.Reader;
import java.io.BufferedReader ;
import java.io.InputStreamReader;
import java.lang.Throwable;
import java.lang.Exception;
import java.io.IOException ;





/**
 * Write a description of class letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Letters extends Universe
{
    boolean isGrabbed=false;
   
    String Dictionary[] = new String[5449];
    int y[] = new int[7];
    int x[] = new int[7];
    int LetterPrice[] = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
     char LettersList[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     char letter ;
    // char letter1;
   int startx=0;
   int starty=0;
   int r=0;
   int colors[][] = new int[15][15];
   
    /**
     * Act - do whatever the letters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
     
    
        if (Greenfoot.mousePressed(this) && !isGrabbed) 
        {
        isGrabbed = true;
         startx=this.getX();
    starty=this.getY();
        
        }
        if (Greenfoot.mouseDragged(this) && isGrabbed)
        {
         MouseInfo mi = Greenfoot.getMouseInfo();
         setLocation(mi.getX(), mi.getY());
          
        }  
        if (Greenfoot.mouseDragEnded(this) && isGrabbed)
        {
            if (places[this.getX()][this.getY()]==0)
            {
                places[this.getX()][this.getY()] = this.letter;
                System.out.println("Falg 100");
            }
            else
            {
                setLocation(startx,starty);
            }
           
                boolean done = false ;
                if (places[7][7]==0)
                {
       
                    places[this.getX()][this.getY()] = 0;
                   
                setLocation(startx,starty);
                done=true;
                }
           
                   
                   
                if (this.getX()<=14 & this.getY()<=14) {
                    
                                       
                    if (places[7][7]!=0 ) {
                        
                  /* if ((places[(this.getX()-1)][this.getY()]==0) & (places[this.getX()][(this.getY()-1)]==0) & (places[this.getX()][(this.getY()+1)]==0) 
                   & (places[(this.getX()+1)][this.getY()]==0) & (places[7][7]!=0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                     
                    
                   }*/
                   if (this.getX()==0 && this.getY()==0)
                   {
                     if ( (places[this.getX()][(this.getY()+1)]==0) 
                   & (places[(this.getX()+1)][this.getY()]==0) & (places[7][7]!=0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                }
                }
            
                    if (this.getX()==0 && this.getY()==14)
                   {
                     if ( (places[this.getX()][(this.getY()-1)]==0) 
                   & (places[(this.getX()+1)][this.getY()]==0) & (places[7][7]!=0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                }
                }
                    if (this.getX()==14 && this.getY()==0)
                   {
                     if ( (places[this.getX()-1][(this.getY())]==0) 
                   & (places[(this.getX())][this.getY()+1]==0) & (places[7][7]!=0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                  if (this.getX()==14 && this.getY()==14)
                   {
                     if ( (places[this.getX()-1][(this.getY())]==0) 
                   & (places[(this.getX())][this.getY()-1]==0) & (places[7][7]!=0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                  if (this.getX()!=0 && this.getY()!=0 && this.getX()<14 && this.getY()<14)
                   {
                    if ((places[(this.getX()-1)][this.getY()]==0) & (places[this.getX()][(this.getY()-1)]==0) & (places[this.getX()][(this.getY()+1)]==0) 
                   & (places[(this.getX()+1)][this.getY()]==0) & (places[7][7]!=0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                
                   if (this.getX()==0 && this.getY()<14 && this.getX()==0 && this.getY()>0)
                   {
                     if ( (places[this.getX()][(this.getY())-1]==0) 
                   & (places[(this.getX())+1][this.getY()]==0) & (places[7][7]!=0) &&  (places[this.getX()][(this.getY())+1]==0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                
                   if (this.getX()==14 && this.getY()<14 && this.getX()==14 && this.getY()>0)
                   {
                     if ( (places[this.getX()][(this.getY())-1]==0) 
                   & (places[(this.getX())-1][this.getY()]==0) & (places[7][7]!=0) &&  (places[this.getX()][(this.getY())+1]==0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                
                   if (this.getX()>0 && this.getY()==0 && this.getX()<14 && this.getY()==0)
                   {
                     if ( (places[this.getX()][(this.getY())+1]==0) 
                   & (places[(this.getX())+1][this.getY()]==0) & (places[7][7]!=0) &&  (places[this.getX()-1][(this.getY())]==0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                   if (this.getX()>0 && this.getY()==14 && this.getX()<14 && this.getY()==14)
                   {
                     if ( (places[this.getX()][(this.getY())-1]==0) 
                   & (places[(this.getX())+1][this.getY()]==0) & (places[7][7]!=0) &&  (places[this.getX()-1][(this.getY())]==0))
                   
                   { 
                     if (this.getX()!=7 || this.getY()!=7){
                 
                     places[this.getX()][this.getY()] = 0;
                     setLocation(startx,starty); }
                    }
                
                }
                
               
                
            
              /*    for (int i=0; i<=14; i++) 
                    { 
                        System.out.println(); 
                        for (int j=0 ; j<14; j++) 
                        {
                       System.out.print(places[i][j]);}
                    }
               */ 
                
               
                        for(int i =0;i<=14;i++)
                {
                    String word="";
                    for (int j=0;j<=14;j++)
                    {  
                     if (places[i][j] != 0)
                     {
                      word= word+places[i][j]; 
                     
                      for (int k=0;k<5440;k++)
                       { 
                           if(Dictionary[k].equals(word))
                        {
                        
                            int Wscore=0 ; 
                            for (int p = 0 ; p<word.length(); p++)
                            {
                              switch (colors[i][j-word.length()+p])
                                      {
                                          
                                       case 3:
                                      
                                        Wscore=Wscore+GetScore(word.charAt(p))*3;
                                        break; 
                                       case 4: 
                                        Wscore=Wscore+GetScore(word.charAt(p))*2;
                                        break;
                                       default:
                                        Wscore=Wscore+GetScore(word.charAt(p));
                                        break;
                                        
                                        
                                      }
                                      
                            }
                            for (int p = 1 ; p<=word.length(); p++)
                            {
                              switch (colors[i][j-word.length()+p])
                                      {
                                          
                                       case 1:
                                      
                                        Wscore=Wscore*2;
                                        break; 
                                       case 2: 
                                        Wscore=Wscore*3;
                                        break;
                                       default:
                                       
                                        break;
                                      }
                                      
                            }
                            score=score + Wscore;  
                            //World w = getWorld();
                            //w.showText("вы набрали "+score,17,15);
                            System.out.println("SCORE === "+score) ;
                        }
                          
                    
                       }
                    
                    }
                      else {word="";}
                    }
                 
          
               
               }  

              
              for(int i =0;i<=14;i++)
                {
                    String word="";
                    for (int j=0;j<=14;j++)
                    {  
                        
                     //word = word+places[i][0];
                     if (places[j][i] != 0)
                     {
                      word= word+places[j][i]; 
                     
                      for (int k=0;k<5440;k++)
                       { //System.out.println(word);
                        //   System.out.println(Dictionary[k]);
                           if(Dictionary[k].equals(word))
                        {
                            System.out.println(word);
                            int Wscore=0 ; 
                            for (int p = 0 ; p<word.length(); p++)
                            {
                              switch (colors[i][j-word.length()+p])
                                      {
                                          
                                       case 3:
                                      
                                        Wscore=Wscore+GetScore(word.charAt(p))*3;
                                        break; 
                                       case 4: 
                                        Wscore=Wscore+GetScore(word.charAt(p))*2;
                                        break;
                                       default:
                                        Wscore=Wscore+GetScore(word.charAt(p));
                                        break;
                                        
                                        
                                      }
                                      
                            }
                            for (int p = 1 ; p<=word.length(); p++)
                            {
                              switch (colors[i][j-word.length()+p])
                                      {
                                          
                                       case 1:
                                      
                                        Wscore=Wscore*2;
                                        break; 
                                       case 2: 
                                        Wscore=Wscore*3;
                                        break;
                                       default:
                                       
                                        break;
                                        
                                        
                                      }
                                      
                            }
                            score=score + Wscore;  
                            System.out.println("SCORE === "+score) ;
                        }
                          
                    
                       }
                    
                    }
                      else {word="";}
                    }
                 
          
               
               }  
               score =0 ;
            }
           
              
               
        
    }
 
 public int GetScore(char IN)
    {
        int a=0;
        for (int z=0; z<26; z++) 
                                {
                                    if (IN==LettersList[z]) {
                                        a=z;
                                    }
                                }
        return LetterPrice[a] ;                         
    }
 public Letters() 
 {
   colors();
   read();
   RefillLetters(7);
     

     for (int i =0;i<=14;i++)
            {
             for (int j =0;j<=14;j++) 
             {
                 places[i][j]=0; 
           
                }
            }
 
 }
 public void read()
 {
     
     try{
       FileInputStream fstream = new FileInputStream("Nouns.txt");
       BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
       
       for (int i = 0 ; i<=5440 ;i++){
           Dictionary[i] = br.readLine();
        }
    }catch (IOException e){
       System.out.println("Error");
    }

 }
   public void RefillLetters (int c)
   {
            for (int i = 0;i<c;i++)
     {
      letter = LettersList[Greenfoot.getRandomNumber(25)] ;
      setImage( letter+".jpg");
        }
    }
    public void colors()
    {
    colors[0][0]=1;
    colors[0][3]=4;
    colors[0][7]=1;
    colors[0][11]=4;
    colors[0][14]=1;
    colors[1][1]=3;
    colors[1][5]=2;
    colors[1][9]=2;
    colors[1][13]=3;
    colors[2][2]=3;
    colors[2][6]=4;
    colors[2][8]=4;
    colors[2][12]=3;
    colors[3][0]=4;
    colors[3][3]=3;
    colors[3][7]=4;
    colors[3][11]=3;
    colors[4][4]=3;
    colors[4][10]=3;
    colors[5][1]=2;
    colors[5][13]=2;
    colors[6][2]=4;
    colors[6][12]=4;
    colors[6][6]=4;
    colors[6][8]=4;
    colors[7][14]=1;
    colors[7][0]=1;
    colors[7][3]=4;
    colors[7][11]=4;
    colors[8][2]=4;
    colors[8][12]=4;
    colors[8][6]=4;
    colors[8][8]=4;
    colors[9][1]=2;
    colors[9][13]=2;
    colors[10][4]=3;
    colors[10][10]=3;
    colors[11][0]=4;
    colors[11][3]=3;
    colors[11][7]=4;
    colors[11][11]=3;
    colors[12][12]=3;
    colors[12][2]=3;
    colors[12][6]=4;
    colors[12][8]=4;
    colors[13][1]=3;
    colors[13][5]=2;
    colors[13][9]=2;
    colors[14][0]=1;
    colors[14][3]=4;
    colors[14][7]=1;
    colors[14][11]=4;
    colors[14][14]=1;
    colors[13][13]=3;
    
    }
}
