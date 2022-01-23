post.addEventListener('click', () => fetch("servlet11", {
        method: 'POST',
        body: JSON.stringify({data:str.value}),
        headers: { 'Content-Type': 'application/json' }
    }).then(r => r.text()).then(txt => response.innerHTML = txt));
 