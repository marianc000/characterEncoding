post.addEventListener('click', () => fetch("servlet9", {
        method: 'POST',
        body: JSON.stringify({data:str.value}),
        headers: { 'Content-Type': 'application/json; charset=utf-8' }
    }).then(r => r.text()).then(txt => response.innerHTML = txt));
 