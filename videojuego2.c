#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <conio.h>
#define col 40
#define row 20
//Variabls globales
 char fondo=' ';
  int px=10,py=5;
  int ix=8, iy=1;
  int mx=17, my=9;
  char personaje='x';
  char pared=178;
  char item='o';
  char malo=207;

  void iniciarMundo(char mundo[row][col]){
  int i,j;
  for(int j=0;j<row;j++)
    for(int i=0;i<col;i++){
        if(i==0||j==0||j==row-1||i==col-1)
        mundo[j][i]=pared;
        else
            mundo[j][i]='.';
  }
  }
int main(void){
  int px=0,py=10,i,j ;
  int ix=8, iy=1;
  int mx=3, my=17;
  int mx2=37, my2=4;
  int ix2=19, iy2=9;
  char mundo[row][col];
  char dir;

  do{
            //formar de espiral
    iniciarMundo(mundo);
    mundo[10][0]=' ';    mundo[6][5]=pared;  mundo[13][10]=pared;   mundo[17][10]=pared;
    mundo[11][1]=pared;  mundo[5][5]=pared;  mundo[13][11]=pared;   mundo[17][9]=pared;
    mundo[11][2]=pared;  mundo[4][5]=pared;  mundo[13][12]=pared;   mundo[17][8]=pared;
    mundo[11][3]=pared;  mundo[3][5]=pared;  mundo[13][13]=pared;   mundo[17][7]=pared;
    mundo[11][4]=pared;  mundo[12][5]=pared; mundo[14][13]=pared;   mundo[17][6]=pared;
    mundo[11][5]=pared;  mundo[13][5]=pared; mundo[15][13]=pared;   mundo[11][1]=pared;
    mundo[10][5]=pared;  mundo[13][6]=pared; mundo[16][13]=pared;   mundo[14][9]=pared;
    mundo[9][5]=pared;   mundo[13][7]=pared; mundo[17][13]=pared;   mundo[15][9]=pared;
    mundo[8][5]=pared;   mundo[13][8]=pared; mundo[17][12]=pared;   mundo[3][6]=pared;
    mundo[7][5]=pared;   mundo[13][9]=pared; mundo[17][11]=pared;   mundo[3][7]=pared;

    mundo[3][8]=pared;    mundo[5][16]=pared; mundo[4][25]=pared;   mundo[5][32]=pared;
    mundo[3][9]=pared;    mundo[5][17]=pared; mundo[3][25]=pared;   mundo[5][33]=pared;
    mundo[3][10]=pared;   mundo[5][18]=pared; mundo[3][26]=pared;   mundo[5][34]=pared;
    mundo[4][10]=pared;   mundo[5][19]=pared; mundo[3][27]=pared;   mundo[1][16]=pared;
    mundo[5][10]=pared;   mundo[5][20]=pared; mundo[3][28]=pared;   mundo[2][16]=pared;
    mundo[5][11]=pared;   mundo[5][21]=pared; mundo[3][29]=pared;   mundo[2][17]=pared;
    mundo[5][12]=pared;   mundo[5][22]=pared; mundo[3][30]=pared;   mundo[2][18]=pared;
    mundo[5][13]=pared;   mundo[5][23]=pared; mundo[4][30]=pared;   mundo[2][19]=pared;
    mundo[5][14]=pared;   mundo[5][24]=pared; mundo[5][30]=pared;   mundo[2][20]=pared;
    mundo[5][15]=pared;   mundo[5][25]=pared; mundo[5][31]=pared;   mundo[8][38]=pared;

    mundo[8][37]=pared;   mundo[10][29]=pared; mundo[10][21]=pared;  mundo[8][13]=pared;
    mundo[8][36]=pared;   mundo[10][28]=pared; mundo[9][21]=pared;   mundo[8][12]=pared;
    mundo[8][35]=pared;   mundo[10][27]=pared; mundo[8][21]=pared;   mundo[8][11]=pared;
    mundo[8][34]=pared;   mundo[10][26]=pared; mundo[8][20]=pared;   mundo[8][10]=pared;
    mundo[8][33]=pared;   mundo[10][25]=pared; mundo[8][19]=pared;   mundo[9][10]=pared;
    mundo[8][32]=pared;   mundo[6][25]=pared;  mundo[8][18]=pared;   mundo[10][10]=pared;
    mundo[8][31]=pared;   mundo[7][25]=pared;  mundo[8][17]=pared;   mundo[17][5]=pared;
    mundo[8][30]=pared;   mundo[10][24]=pared; mundo[8][16]=pared;   mundo[16][5]=pared;
    mundo[9][30]=pared;   mundo[10][23]=pared; mundo[8][15]=pared;   mundo[12][13]=pared;
    mundo[10][30]=pared;  mundo[10][22]=pared; mundo[8][14]=pared;   mundo[9][17]=pared;

    mundo[10][17]=pared;  mundo[17][20]=pared;  mundo[18][34]=pared;   mundo[14][31]=pared;
    mundo[11][17]=pared;  mundo[17][21]=pared;  mundo[17][34]=pared;   mundo[14][30]=pared;
    mundo[12][17]=pared;  mundo[17][22]=pared;  mundo[16][34]=pared;   mundo[14][29]=pared;
    mundo[13][17]=pared;  mundo[17][23]=pared;  mundo[15][34]=pared;   mundo[14][28]=pared;
    mundo[14][17]=pared;  mundo[17][24]=pared;  mundo[14][34]=pared;   mundo[14][27]=pared;
    mundo[15][17]=pared;  mundo[17][25]=pared;  mundo[13][34]=pared;   mundo[14][26]=pared;
    mundo[16][17]=pared;  mundo[17][26]=pared;  mundo[12][34]=pared;   mundo[14][25]=pared;
    mundo[17][17]=pared;  mundo[17][27]=pared;  mundo[11][34]=pared;   mundo[14][24]=pared;
    mundo[17][18]=pared;  mundo[17][28]=pared;  mundo[14][33]=pared;   mundo[14][23]=pared;
    mundo[17][19]=pared;  mundo[17][29]=pared;  mundo[14][32]=pared;   mundo[14][22]=pared;

    mundo[14][21]=pared;
    mundo[13][21]=pared;
    mundo[11][26]=pared;
    mundo[12][26]=pared;
    mundo[12][21]=pared;
    mundo[18][39]=' ';
    mundo[17][39]=' ';
    mundo[9][0]=' ';

  //poner el personaje

  mundo[py][px]=personaje;
  mundo[iy][ix]=item;
  mundo[my][mx]=malo;
  mundo[my2][mx2]=malo;
  mundo[iy2][ix2]=item;
  //imprimir el mundo
  system("cls");
  for(int j=0;j<row;j++){
    for(int i=0;i<col;i++)
    printf("%c",mundo[j][i]);
   printf("\n");
  }

  if(personaje==mundo[18][39]){
    system("cls");
    printf("¡¡¡FELICIDADES HAZ GANADO!!!");
    Beep(1568,200);
    Beep(1568,200);
    Beep(1568,200);
    Beep(1245,1000);
  }
  printf("\n");
  dir=getche();
  fflush(stdin);
  switch(dir){
  case 'a':
    if(mundo[py][px-1]!=pared)
      px--;

    if(mundo[my][mx-1]!=pared)
        mx--;
    if(mundo[my2][mx2+1]!=pared)
        mx2++;
    break;
  case 'd':
      if(mundo[py][px+1]!=pared)
      px++;
      if(mundo[my][mx+1]!=pared)
        mx++;
      if(mundo[my2][mx2+1]!=pared)
        mx2++;
    break;
  case 's':
    if(mundo[py+1][px]!=pared){
      py++;
      if(mundo[my+1][mx]!=pared)
        my++;
    if(mundo[my2-1][mx2]!=pared)
        my2--;
    }
        Beep(1000,100);
    break;
  case 'w':
      if(mundo[py-1][px]!=pared)
      py--;
      if(mundo[my-1][mx]!=pared)
        my--;
      if(mundo[my2+1][mx2]!=pared)
        my2++;
            Beep(300,100);
    break;
  case 'p':
    break;
  }
  if(px==ix&&py==iy||px==ix2&&py==iy2){
    personaje='X';
    if(px>=ix)
    item=' ';
  }
  if(px==mx&&py==my||px==mx2&&py==my2)
    personaje='x';
   if(px==mx&&py==my||px==mx2&&py==my2)
         mundo[py][px]=personaje;
}while(dir!='p');

  return 0;
}
