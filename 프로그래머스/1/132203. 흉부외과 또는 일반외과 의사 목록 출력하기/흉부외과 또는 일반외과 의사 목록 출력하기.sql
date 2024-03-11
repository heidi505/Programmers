-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d')
from doctor
where mcdp_cd = "CS" or mcdp_cd = "GS"
order by hire_ymd desc, dr_name;