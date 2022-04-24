import request from '@/utils/request'

// 查询算法学习列表
export function listAlgorithm(query) {
  return request({
    url: '/study/algorithm/list',
    method: 'get',
    params: query
  })
}

// 查询算法学习详细
export function getAlgorithm(leetId) {
  return request({
    url: '/study/algorithm/' + leetId,
    method: 'get'
  })
}

// 新增算法学习
export function addAlgorithm(data) {
  return request({
    url: '/study/algorithm',
    method: 'post',
    data: data
  })
}

// 修改算法学习
export function updateAlgorithm(data) {
  return request({
    url: '/study/algorithm',
    method: 'put',
    data: data
  })
}

// 删除算法学习
export function delAlgorithm(leetId) {
  return request({
    url: '/study/algorithm/' + leetId,
    method: 'delete'
  })
}
