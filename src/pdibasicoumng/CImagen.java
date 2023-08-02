package pdibasicoumng;

import java.awt.image.*;

public class CImagen{
    
    private BufferedImage mImg;
    
    public CImagen(){
        
        mImg=null;
        
    }
    
    public void agregarImagen(BufferedImage img){
        
        mImg=img;
        
    }
    public BufferedImage retornarImagen(){
        
        return mImg;
        
    }
    
    public void Brillo(int k)
            
    {
        
        int alto = mImg.getHeight(); 
        int ancho = mImg.getWidth();
        int ColorActual = 0;
        int a, r, g, b;
        int NuevoColor = 0;
        
        for (int x = 0; x < ancho; x++){//filas
            
            for (int y = 0; y < alto; y++) {//columnas
                
                ColorActual = mImg.getRGB(x, y); 
                a = (ColorActual >> 24) & 0xff;
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                r = r + k;
                
                if (r > 255){
                    
                    r = 255;
                    
                }
                
                if (r < 0){
                    
                    r = 0;
                    
                }
                
                g = g + k;
                
                if (g > 255){
                    
                    g = 255;
                    
                }
                
                if (g < 0){
                    
                    g = 0;
                    
                }
                
                b = b + k;
                
                if (b > 255){
                    
                    b = 255;
                    
                }
                
                if (b < 0){
                    
                    b = 0;
                    
                }
                
                NuevoColor = (a << 24) | (r << 16) | (g << 8) | b;
                mImg.setRGB(x, y, NuevoColor);
                
            }
        }
    }
    
    public void Negativo(){
        
        int alto= mImg.getHeight(); 
        int ancho= mImg.getWidth();
        int ColorActual=0;
        int a,r,g,b;
        int NuevoColor = 0;
        
        for (int x = 0; x < ancho; x++){//filas
            
            for (int y = 0; y < alto; y++) {//columnas
                
                ColorActual = mImg.getRGB(x, y); 
                a = (ColorActual >> 24) & 0xff;
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                r = (255 - 1) - r;
                
                if (r > 255){
                    
                    r = 255;
                
                }
                
                if (r < 0){
                
                    r = 0;
                
                }
                g = (255 - 1) - g;
                
                if (g > 255){
                    
                    g = 255;
                
                }
                
                if (g < 0){
                    
                    g = 0;
                
                }
                
                b = (255 - 1) - b;
                
                if (b > 255){
                
                    b = 255;
                
                }
                
                if (b < 0){
                
                    b = 0;
                
                }
                
                NuevoColor = (a << 24) | (r << 16) | (g << 8) | b;
                mImg.setRGB(x,y,NuevoColor);
                
            }
        }
    }
    
    public void Contraste(float k){
        
        int alto = mImg.getHeight(); 
        int ancho = mImg.getWidth();
        int ColorActual=0;
        int a,r,g,b;
        int contR = 0, contG = 0, contB = 0;
        double VC = 1/alto*ancho; // valor de contraste
        int NuevoColor=0;
        
        for (int x = 0; x < ancho; x++){
        
            for (int y = 0; y < alto; y++){
            
                ColorActual=mImg.getRGB(x, y); 
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                contR = contR + r;
                contG = contG + g;
                contB = contB + b;
            
            }
        
        }
        
        double VCR = VC * contR;
        double VCG = VC * contG;
        double VCB = VC * contB;
        
        for (int x = 0; x < ancho; x++){//filas
            
            for (int y = 0; y < alto; y++) {//columnas
                
                ColorActual=mImg.getRGB(x, y); 
                a = (ColorActual >> 24) & 0xff;
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                r=(int) (k*(r-VCR)+VCR);
                
                if (r > 255){
                    
                    r = 255;
                    
                }
                
                if (r < 0){
                    
                    r = 0;
                    
                }
                
                g = (int) (VCG+k*(g-VCG));
                
                if (g > 255){
                    
                    g = 255;
                    
                }
                
                if (g < 0){
                    
                    g = 0;
                
                }
                
                b = (int) (k*(b-VCB)+VCB);
                
                if (b > 255){
                    
                    b = 255;
                
                }
                
                if (b < 0){
                    
                    b = 0;
                
                }
                
                NuevoColor = (a << 24) | (r << 16) | (g << 8) | b;
                mImg.setRGB(x,y,NuevoColor);
            
            }
        }
    }
    
    public void Automatico(){
        
        int alto= mImg.getHeight(); 
        int ancho= mImg.getWidth();
        int ColorActual = 0;
        int a,r,g,b;
        int maxR = 0, minR = 255, maxG = 0, minG = 255, maxB = 0, minB = 255;
        int NuevoColor = 0;
        
        for (int x = 0; x < ancho; x++){//filas
                 
            for (int y = 0; y < alto; y++) {//columnas

                ColorActual = mImg.getRGB(x, y); 
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                if(r < minR){
                
                    minR = r;
                    
                } 
                if(r > maxR){
                
                    maxR = r;
                    
                }
                
                if(g < minG){
                
                    minG = g;
                    
                }
                
                if(g > maxG){
                
                    maxG = g;
                    
                }
                
                if(b < minB){
                
                    minB = b;
                    
                }
                
                if(b > maxB){
                
                    maxB = b;
                    
                }
                
            }
            
        }
        
        System.out.println(maxR+" "+minR+" "+maxG+" "+minG+" "+maxB+" "+minB);
        
        for (int x = 0; x < ancho; x++){//filas
            
            for (int y = 0; y < alto; y++) {//columnas
                
                ColorActual = mImg.getRGB(x, y); 
                a = (ColorActual >> 24) & 0xff;
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                r = ((r - minR)*(255))/(maxR - minR);
                
                if (r > 255){
                    
                    r = 255;
                    
                }
                
                if (r < 0){
                    
                    r = 0;
                    
                }
                
                g = ((g - minG)*(255))/(maxG - minG);
                
                if (g > 255){
                    
                    g = 255;
                    
                }
                if (g < 0){
                    g = 0;
                }
                
                b = ((b - minB)*(255))/(maxB - minB);
                
                if (b > 255){
                    
                    b = 255;
                    
                }
                
                if (b < 0){
                    
                    b = 0;
                    
                }
                
                NuevoColor = (a << 24) | (r << 16) | (g << 8) | b;
                mImg.setRGB(x,y,NuevoColor);
                
            }
        }
    }
    public void No_Lineal_Maximo(){
        
        int alto= mImg.getHeight(); 
        int ancho= mImg.getWidth();
        int ColorActual=0;
        int a,r,g,b,aaux,raux,gaux,baux;
        int NuevoColor = 0;
        int MaximoA,MaximoR,MaximoG,MaximoB;
                MaximoR=0;
                MaximoG=0;
                MaximoB=0;
                MaximoA=0;
        for (int x = 0; x < ancho; x++){//filas
            
            for (int y = 0; y < alto; y++) {//columnas
                ColorActual = mImg.getRGB(x, y); 
                a = (ColorActual >> 24) & 0xff;

                for (int q = -15; q <30; q++){//filas
                    
                    for (int w = -15; w < 30; w++) {//columnas
                        
                        ColorActual = mImg.getRGB(x+q, y+w);
                        aaux = (ColorActual >> 24) & 0xff;
                        raux = (ColorActual >> 16) & 0xff;
                        gaux = (ColorActual >> 8) & 0xff;
                        baux = ColorActual & 0xff;
                        
                        if(aaux > MaximoA){
                
                          MaximoA = aaux;
                    
                        }if(raux > MaximoR){
                
                          MaximoR = raux;
                    
                        }if(gaux > MaximoG){
                
                          MaximoG = gaux;
                    
                        }if(baux > MaximoB){
                
                          MaximoB = baux;
                    
                        } 
              
            
                     }
                }
                NuevoColor = (MaximoA << 24) | (MaximoR << 16) | (MaximoG << 8) | MaximoB;
                mImg.setRGB(x,y,NuevoColor);
                
            }
        }
    }
    public void Raiz(int k){
        
        int alto = mImg.getHeight(); 
        int ancho = mImg.getWidth();
        int ColorActual=0;
        int a,r,g,b;
        int contR = 0, contG = 0, contB = 0;
        double VC = 1/alto*ancho; // valor de contraste
        int NuevoColor=0;
        
        for (int x = 0; x < ancho; x++){
        
            for (int y = 0; y < alto; y++){
            
                ColorActual=mImg.getRGB(x, y); 
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                contR = contR + r;
                contG = contG + g;
                contB = contB + b;
            
            }
        
        }
        
        double VCR = VC * contR;
        double VCG = VC * contG;
        double VCB = VC * contB;
        
        for (int x = 0; x < ancho; x++){//filas
            
            for (int y = 0; y < alto; y++) {//columnas
                
                ColorActual = mImg.getRGB(x, y); 
                a = (ColorActual >> 24) & 0xff;
                r = (ColorActual >> 16) & 0xff;
                g = (ColorActual >> 8) & 0xff;
                b = ColorActual & 0xff;
                
                r = (int)(Math.pow(((float)r/255.0f),1.0f/(float)k) * 255);
                
                if (r > 255){
                    
                    r = 255;
                    
                }
                
                if (r < 0){
                    
                    r = 0;
                    
                }
                
                g = (int)(Math.pow(((float)g/255.0f),1.0f/(float)k) * 255);
                
                if (g > 255){
                    
                    g = 255;
                    
                }
                
                if (g < 0){
                    
                    g = 0;
                
                }
                
                b = (int)(Math.pow(((float)b/255.0f),1.0f/(float)k) * 255);
                
                if (b > 255){
                    
                    b = 255;
                
                }
                
                if (b < 0){
                    
                    b = 0;
                
                }
                
                NuevoColor = (a << 24) | (r << 16) | (g << 8) | b;
                mImg.setRGB(x,y,NuevoColor);
            
            }
        }
    }
    
}
