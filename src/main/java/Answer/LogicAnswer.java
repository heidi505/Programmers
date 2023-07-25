package Answer;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LogicAnswer {
        public int solution(int a, int b, int c, int d) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int data : new int[] {a, b, c, d}) {
                if (map.containsKey(data)) map.put(data, map.get(data) + 1);
                else map.put(data, 1);
            }

            PriorityQueue<Dice> pq = new PriorityQueue<>();
            for (int key : map.keySet())
                pq.add(new Dice(key, map.get(key)));

            int answer = 0;
            if (pq.size() == 1) answer = pq.poll().number * 1111;
            else if (pq.size() == 3) {
                pq.poll();
                answer = pq.poll().number * pq.poll().number;
            } else if (pq.size() == 4) {
                pq.poll(); pq.poll(); pq.poll();
                answer = pq.poll().number;
            } else {
                Dice maxDice = pq.poll();
                Dice next = pq.poll();
                if (maxDice.count == 3) {
                    answer = (10 * maxDice.number + next.number) * (10 * maxDice.number + next.number);
                } else {
                    answer = (maxDice.number + next.number) * ((int)(Math.abs(maxDice.number - next.number)));
                }
            }
            return answer;
        }

        public class Dice implements Comparable<Dice> {
            int number;
            int count;
            public Dice(int number, int count) {
                this.number = number;
                this.count = count;
            }

            @Override
            public int compareTo(Dice o) {
                if (this.count == o.count)
                    return o.number - this.number;
                return o.count - this.count;
            }
        }
    }

// 연구해보려고 프로그래머스에  Hyeona님 풀이 가져옴
