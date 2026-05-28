class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        /*int len =temperatures.length;暴力
        int []answer =new int[len];
        for(int i=0;i<len;i++){
            answer[i]=0;
        }
        for(int i=0;i<len;i++){
            
            for(int j=i+1;j<len;j++){
                if(temperatures[j]>temperatures[i]){
                    answer[i]=j-i;
                    break;
                }
                
            }   
        }
        return answer;
        */
        
        //单调栈
            int len =temperatures.length;
            int []answer=new int[len];
            Deque<Integer> stack= new ArrayDeque<>();
        for(int i=0;i<len;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int pre =stack.pop();
                answer[pre]=i-pre;
            }
            stack.push(i);
        }
        return answer;
    }
    }
