-- 코드를 입력하세요
SELECT board.TITLE, board.BOARD_ID, reply.REPLY_ID, reply.WRITER_ID, reply.CONTENTS, DATE_FORMAT(reply.CREATED_DATE, '%Y-%m-%d') as created_date
from USED_GOODS_BOARD board
join USED_GOODS_REPLY reply on board.board_id = reply.board_id and DATE_FORMAT(board.created_date, '%Y-%m') = DATE_FORMAT(board.created_date, '2022-10')
order by reply.created_date, board.title;