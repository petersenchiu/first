
public class Cheese {
static int[] d1=new int[2];	
static int[][] map={{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{-2,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,-3,0,0,0,0},
			{0,0,0,0,0,0,0,0,0}};
void Traseu()
{
	int m[]=new int[2], c[]=new int[2],d[]=new int[2],s[][]=new int[100][2],k1=1,k2,p,k3=0;
	Display();
	for(int i=0;i<=8;i++)
		for(int j=0;j<=8;j++){
			if(map[i][j]==-3){m[0]=i;m[1]=j;}
			if(map[i][j]==-2){c[0]=i;m[1]=j;}
		}
	for(int i=0;i<100;i++)
		s[i][0]=-1;
	s[0][0]=m[0];
	s[0][1]=m[1];
	while(k1>0){
		for(int i=0;i<100;i++)
		{
			if(s[i][0]!=-1){
				d[0]=s[i][0];
				d[1]=s[i][1];
				s[i][0]=-1;
				for(int j=0;j<4;j++){
					p=Directii(d);
					if(p==2){
						Display();
						return;
					}
					if(p==1)
					{
						for(int k=0;k<0;k++)
							if(s[k][0]==-1)
							{
								s[k][0]=d1[0];
								s[k][1]=d1[1];
								if(k>k1)k1=k;
								map[d1[0]][d1[1]]=2+k3;
								k3++;
								Display();
								break;
							}
					}
				}
			}
		}
		
	}
}
static int Directii(int[] d)
{
	for(int i=-1;i<=1;i++)
		for(int j=-1;j<=1;j++)
			if(Math.abs(i)!=Math.abs(j))
				if(d[0]+i>=0&&d[0]+i<=8&&d[1]+j>=0&&d[1]+j<=8)
				{
					d1[0]=d[0]+i;
					d1[1]=d[1]+j;
					if(map[d1[0]][d1[1]]==-2)return 2;
					if(map[d1[0]][d1[1]]==0)return 1;
				}
	return 0;
}
static void Display(){
	for(int i=0;i<=8;i++){
		for(int j=0;j<=8;j++)
			System.out.print(map[i][j]);
	System.out.println("");
	}
	System.out.println("");
}
}
